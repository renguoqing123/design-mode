package com.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式 （将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象）
 * @author rengq 2018年6月15日 上午11:25:29
 */
public class Prototype implements Cloneable,Serializable{
    
    private static final long serialVersionUID = -9140241956457225621L;

    /* 浅复制 */  
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype p= (Prototype)super.clone();
        return p;
    }
    
    /* 深复制 */  
    public Object deepClone() throws IOException, ClassNotFoundException {  
  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
}
