package singleton;

/**
 *  这个实现方法也很巧妙，他利用了静态内部类的特点
 *  1. 外部类加载时，内部类不加载
 *  2. 在内部类构建的时候是线程安全的，所以整体也是线程安全的
 *
 *  推荐使用。
 * @Description 懒汉式，静态内部类
 * @Author v_liyichen
 * @date 2020.12.07 17:13
 */
public class Singleton8 {

    public static class InnerClass {
        private final static Singleton8 s8 = new Singleton8();
    }

    private Singleton8() {}

    public static Singleton8 getInstance() {
        return InnerClass.s8;
    }
}
