package singleton;

/**
 * 线程安全，还实现了延迟加载，推荐使用.
 * @Description 懒汉式，双重检查的方式
 * @Author v_liyichen
 * @date 2020.12.07 17:08
 */
public class Singleton6 {

    private static volatile Singleton6 s6 = null;
    private Singleton6() {};

    public static Singleton6 getInstance() {
        // 下次进入只需要判断就行，不会再走同步代码块了。
        if (s6 == null) {
            // 尽管有两个线程同时进入，同步代码块只允许一个线程进入，
            synchronized (Singleton6.class) {
                // 这个判断再次判断之后，我们的对象就是线程安全的，而且由于volatile修饰，对象改变后会立马刷新主存！
                if (s6 == null) {

                    s6 = new Singleton6();
                }
            }
        }

        return s6;
    }
}
