package singleton;

/**
 * 线程安全，但是存在内存浪费的问题
 * @Description 饿汉式 静态代码块
 * @Author v_liyichen
 * @date 2020.12.07 16:58
 */
public class Singleton2 {

    private static Singleton2 singleton2 ;

    static {

        singleton2 = new Singleton2();

    }
    private Singleton2() {}

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
