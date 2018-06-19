package com.iterator;
public class Test {
    public static void main(String[] args) {
        String[] str= {"1","2","3","4","5","6"};
        Collection col=new MyCollection(str);
        Iterator it=col.iterator();
        while (it.hasNext()) {
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}
