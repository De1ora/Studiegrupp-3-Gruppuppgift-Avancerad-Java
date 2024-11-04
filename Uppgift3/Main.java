package Uppgift3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Calculator.class;

        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);

            Object calculatorObject = constructor.newInstance(4);

            Method addMethod = clazz.getDeclaredMethod("add", int.class);
            addMethod.setAccessible(true);

            int result = (int) addMethod.invoke(calculatorObject, 6);
            System.out.println(result);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
