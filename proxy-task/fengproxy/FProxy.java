package gupao.edu.proxy.fengproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 生产代理类
 */
public class FProxy {

    public static final String ln = "\r\n";

    public static Object newFProxyInstance(FClassLoader loader,Class<?>[] interfaces,FInvocationHandler h){
        //生产代理类的源代码
        String str = generateCode(interfaces);

        System.out.println(str);

        try {
            //java文件输出到磁盘
            String filePath = FProxy.class.getResource("").getPath();
            File f = new File(filePath+"$Proxy0.java");
            FileWriter file = new FileWriter(f);
            file.write(str);
            file.flush();
            file.close();

            //3、把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();

            //4、编译生成的.class文件加载到JVM中来
            Class proxyClass =  loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(FInvocationHandler.class);
            f.delete();

            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateCode(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package gupao.edu.proxy.fengproxy;"+ ln);
        sb.append("import gupao.edu.proxy.fengproxy.FPostProcess;"+ ln);
        sb.append("import gupao.edu.proxy.fengproxy.FIJob;"+ ln);
        sb.append("import java.lang.reflect.*;"+ ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ ln);

        sb.append("FInvocationHandler h;"+ ln);
        sb.append("public $Proxy0(FInvocationHandler h){"+ ln);
            sb.append("this.h = h;"+ ln);
        sb.append("}"+ ln);

        for (Method m : interfaces[0].getMethods()){
            sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"(){"+ ln);
                sb.append("try{"+ ln);
                    sb.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});"+ln);
                    sb.append("this.h.invoke(this,m,null);"+ln);
                sb.append("}catch(Throwable e){"+ ln);
                    sb.append("e.printStackTrace();"+ ln);
                sb.append("}"+ ln);
            sb.append("}"+ ln);


        }
        sb.append("}");
        return sb.toString();

    }
}
