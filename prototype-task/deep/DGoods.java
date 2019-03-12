package com.gupaoedu.vip.pattern.selfprototype.deep;

import java.io.Serializable;
import java.util.Date;

public class DGoods implements Cloneable,Serializable {

    private String name;
    private float price;
    private String addr;
    private Date createTime;
    private Date keepTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getKeepTime() {
        return keepTime;
    }

    public void setKeepTime(Date keepTime) {
        this.keepTime = keepTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
