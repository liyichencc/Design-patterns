package proxy.staticproxy;

/**
 * 静态代理，这样做如果接口增加了方法，我们需要维护很多的代理类
 *
 * @Description
 * @Author v_liyichen
 * @date 2020.12.07 17:21
 */
public class Test {

    public static void main(String[] args) {

        IDao target = new IDaoImpl();

        IDao proxy = new IDaoProxy(target);

        proxy.find();
    }
}
