package org.pratap.jfs.core.reflection.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by orgpratap on 5/17/17.
 */
public class Application {
    public static void main(String[] args) throws Exception{


        Test obj = new Test();

        Class cls = obj.getClass();
        System.out.println("Class Name [ cls.getName() ]= "+cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("Constructor name [ constructor.getName() ]: "+constructor.getName());

        System.out.println("---------[ public methods of the class are ]----------");

        Method[] methods = cls.getMethods();

        for(Method method : methods){
            System.out.println("--> " + method.getName());
        }

        System.out.println("------------------------------------------------------");

        Method methodCall1 = cls.getDeclaredMethod("method2", int.class);
        methodCall1.invoke(obj, 10);

        Field field = cls.getDeclaredField("s");
        field.setAccessible(true);

        field.set(obj, "SATENDRA PRATAP SINGH");

        Method methodCall2 = cls.getDeclaredMethod("method1");

        methodCall2.invoke(obj);

        Method methodCall3 = cls.getDeclaredMethod("method");
        methodCall3.setAccessible(true);

        methodCall3.invoke(obj);


    }
}
