package org.pratap.jfs.core.reflection.demo1;

/**
 * Created by orgpratap on 5/17/17.
 */
public class Test {

    private String s;

    public Test(){
        s = "javaforsuccess";
    }

    public void method1(){
        System.out.println("method1 called : The string is :"+s);
    }

    public void method2(int n){
        System.out.println("method2(int n) called : The number is :"+n);
    }

    private void method(){
        System.out.println("Private method invoked");
    }

}
