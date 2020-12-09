package template;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.09 11:52
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass a = new SubClassA();
        AbstractClass b = new SubClassB();
        a.abstractMethod();
        System.out.println("-------------------");
        b.abstractMethod();
    }
}
