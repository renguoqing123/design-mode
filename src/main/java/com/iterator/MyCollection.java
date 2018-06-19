package com.iterator;
public class MyCollection implements Collection{
    
    private String[] str;
    
    public MyCollection(String[] str) {
        this.str=str;
    }
    
    public Iterator iterator() {  
        return new MyIterator(this);  
    }  
  
    public Object get(int i) {  
        return str[i];  
    }  
  
    public int size() {  
        return str.length;  
    }  
}
