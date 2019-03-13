package gupao.edu.proxy.fengproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class FClassLoader extends ClassLoader {

    private File classPathFile;

    public FClassLoader(){
        String classPath = FClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //类路径
        String className = FClassLoader.class.getPackage().getName()+"."+name;
        if (classPathFile != null){
            //读取class文件
            File file = new File(classPathFile,name.replaceAll("\\.","/")+".class");
            try {
                if (file.exists()){
                    FileInputStream inputStream = new FileInputStream(file);
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len=inputStream.read(bytes)) !=-1){
                        outputStream.write(bytes,0,len);
                    }
                    return defineClass(className,outputStream.toByteArray(),0,outputStream.size());
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return null;
    }
}
