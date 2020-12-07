package singleton;

/**
 * 线程安全，但是效率低下，每次调用getInstance都是同步的。
 * @Description 懒汉式 同步方法
 * @Author v_liyichen
 * @date 2020.12.07 17:02
 */
public class Singleton4 {

    private static Singleton4 s4;
    private Singleton4() {}

    public static synchronized Singleton4 getInstance() {
        if (s4 == null) {
            s4 = new Singleton4();
        }
        return s4;
    }
}
