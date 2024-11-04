package Uppgift4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Methods method = new Methods("test", 1);
        Method[] methods = method.getClass().getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(AutoCall.class) && m.getParameterCount() == 0) {
                m.setAccessible(true);

                m.invoke(method);
            }
        }
    }
}
