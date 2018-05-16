package multi.test;

public class LumenImpl {

    private static Object instance = getInstance();

    private static Object getInstance() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            Class<?> aClass = contextClassLoader.loadClass("multi.test.LumenImpl");
            return aClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new IllegalArgumentException("Class loading error", e);
        }
    }
}
