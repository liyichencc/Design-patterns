package singleton;

/**
 * 线程安全，但是会存在内存浪费的情况
 * @Description 实现方式1 饿汉式 静态变量
 *
 * @Author v_liyichen
 * @date 2020.12.07 16:54
 */
public class Singleton1 {

    private static final Singleton1 demo1 = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return demo1;
    }
}
