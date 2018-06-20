package com.classLoader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 类加载器的委托行为动机是为了避免相同的类被加载多次
 * @author rengq 2018年6月20日 下午5:44:01
 */
public class FileSystemClassLoader extends ClassLoader{
    
    private String rootDir;

    public FileSystemClassLoader(String rootDir) {
        this.rootDir=rootDir;
    }
    
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        Class<?> c = findLoadedClass(name);//查询类是否已经加载
        if (c != null) {
            return c;
        } else {
            ClassLoader parent = this.getParent();//调用父类加载器
            try {
                c = parent.loadClass(name);//查询上一层类加载器是否存在该类
            }catch (Exception e) {
               
            }
            
            if (c != null) {
                return c;
            } else {
                byte[] classData = getClassData(name);//加载本地类文件
                if (classData == null) {
                    throw new ClassNotFoundException();//不存在抛异常
                } else {
                    c = defineClass(name, classData, 0, classData.length);//存在，通过defineClass转换成 Class对象
                }
            }
        }
        return c;
    }

    private byte[] getClassData(String name) {
        String path = rootDir + "/" + name.replace('.', '/') + ".class";

        //将class文件转换成字节数组
        InputStream is = null;
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        try {
            is = new FileInputStream(path);
            byte[] buffer = new byte[1024];
            int temp = 0;
            while ((temp = is.read(buffer)) != -1) {
                bs.write(buffer, 0, temp);
            }
            return bs.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            try {
                if (bs != null) {
                    bs.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
    
}
