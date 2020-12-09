package singleton;

/**
 * 我们把需要单例的类定义成枚举，这样也可以实现单例，推荐使用。
 * @Description 懒汉式，枚举
 * @Author v_liyichen
 * @date 2020.12.07 17:11
 */
public enum  Singleton7 {
    INSTANCE;
    public static void main(String[] args) {
        Singleton7 s7 = Singleton7.INSTANCE;
    }

    public void method() {
        System.out.println("你可以写其他方法");
    }
}


