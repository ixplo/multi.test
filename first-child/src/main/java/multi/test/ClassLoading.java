package multi.test;

import org.springframework.util.ReflectionUtils;
import sun.misc.URLClassPath;

import java.lang.reflect.Field;
import java.net.URL;

public class ClassLoading {

    public static Object load() throws Exception {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Field field = systemClassLoader.getClass().getDeclaredField("ucp");
        field.setAccessible(true);
        URLClassPath ucp = (URLClassPath) ReflectionUtils.getField(field, systemClassLoader);
        ucp.addURL(new URL("file:/C:/Users/ixplo/IdeaProjects/multi-module/api/target/api-1.0-SNAPSHOT.jar"));
        ucp.addURL(new URL("file:/C:/Users/ixplo/IdeaProjects/multi-module/first-child/target/first-child-1.0-SNAPSHOT.jar"));
        systemClassLoader.loadClass("multi.test.LumenImpl");
        return get();
    }

    public static Object get() throws ClassNotFoundException, NoSuchFieldException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> loadedClass = systemClassLoader.loadClass("multi.test.LumenImpl");
        Field instance = loadedClass.getDeclaredField("instance");
        instance.setAccessible(true);
        return ReflectionUtils.getField(instance, loadedClass);
    }
}
