package design_patterns;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /**
         * 测试HungryModeSingleton
         */
        HungryModeSingleton h1 = HungryModeSingleton.getInstance();
        HungryModeSingleton h2 = HungryModeSingleton.getInstance();
        System.out.println(h1 == h2);

        /**
         * 测试LazyModeSingleton
         */
        LazyModeSingleton1 l1 = LazyModeSingleton1.getInstance();
    }
}
