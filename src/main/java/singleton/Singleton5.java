package singleton;

/**
 * 线程不安全的方式，不要使用。
 * @Description 懒汉式，静态代码块
 * @Author v_liyichen
 * @date 2020.12.07 17:05
 */
public class Singleton5 {

    private static Singleton5 s5 = null;
    private Singleton5() {};

    public static Singleton5 getInstance() {

        if (s5 == null) {
            // 如果多线程环境下，依然会有多个线程进入到这块的逻辑，因此还是线程不安全的。不要使用！
            synchronized (Singleton5.class) {

                s5 = new Singleton5();
            }
        }

        return s5;
    }

}
