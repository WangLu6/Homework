package prg.westos.day21;
import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Find {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
      ClassLoader cl = new ClassLoader() {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                try {
                    FileInputStream in = new FileInputStream("Treasure.class");
                    byte[] bytes = new byte[1024 * 8];
                    int len = in.read(bytes);
                    return defineClass(name, bytes, 0, len);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };

        Class<?> clazz = cl.loadClass("com.westos.Treasure");

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Resource.class)){
                method.invoke(o);
            }
        }

    }
}


