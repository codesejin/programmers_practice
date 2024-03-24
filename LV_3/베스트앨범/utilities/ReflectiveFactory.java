package LV_3.베스트앨범.utilities;

import LV_3.베스트앨범.internal.ImageBuffer;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectiveFactory {

    public static void main(String[] args) throws Throwable {
//        createObject(ImageBuffer.class,200);
//        Object argument = new byte[700];
//        createObject(ImageBuffer.class, argument);
        System.out.println(createObject(ImageBuffer.class));
    }

    public static <T> T createObject(Class<T> clazz, Object ... args) throws Throwable {
        Class<?>[] parameterTypes = Arrays.stream(args)
                .map(Object::getClass)
                .toArray(Class[]::new);
        System.out.println(Arrays.toString(parameterTypes));
        Constructor<?> constructor =
                clazz.getDeclaredConstructor(parameterTypes);

        return (T) constructor.newInstance(args);
    }
}