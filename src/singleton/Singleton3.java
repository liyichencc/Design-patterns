package singleton;

/**
 * 线程不安全，不要使用
 * @Description 懒汉式
 * @Author v_liyichen
 * @date 2020.12.07 17:00
 */
public class Singleton3 {

    private static Singleton3 s3 = null;
    private Singleton3() {};

    public static Singleton3 getInstance() {
        // 这里如果有多个线程进入了if代码块就会存在线程安全的问题
        if (s3 ==  null) {
            s3 = new Singleton3();
        }
        return s3;
    }
}
