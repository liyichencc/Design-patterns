package proxy.dynamic.cglib;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.09 10:26
 */
public class Test {

    public static void main(String[] args) {

        Dao d = new Dao();

        ProxyFactory factory = new ProxyFactory(d);

        Dao proxyInstance = (Dao)factory.getProxyInstance();
        proxyInstance.find();
    }
}
