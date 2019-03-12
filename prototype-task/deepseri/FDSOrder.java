package com.gupaoedu.vip.pattern.selfprototype.deepseri;


import java.io.*;
import java.util.Date;

public class FDSOrder implements Cloneable, Serializable {

    private long Id;
    private String name;
    private DSGoods goods;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DSGoods getDGoods() {
        return goods;
    }

    public void setDGoods(DSGoods goods) {
        this.goods = goods;
    }
    @Override
    protected Object clone()  {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            FDSOrder copy = (FDSOrder)ois.readObject();
            copy.setDGoods(new DSGoods());
            copy.getDGoods().setCreateTime(new Date());
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
    return null;
    }

}
