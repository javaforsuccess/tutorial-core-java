package org.pratap.jfs.core.reflection.demo1;

/**
 * Created by orgpratap on 5/17/17.
 */
public class Application {
    public static void main(String[] args){
        Test obj = new Test();

        Class cls = obj.getClass();
        System.out.println("Class Name [cls.getName()]= "+cls.getName());
    }
}
