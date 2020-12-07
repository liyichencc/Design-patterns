package proxy.dynamic.jdk;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.07 17:31
 */
public class Test {

    public static void main(String[] args) {
       IDao i =  new IDaoImpl();

       ProxyObjectFactory p = new ProxyObjectFactory(i);

       IDao o = (IDao)p.dynamicProxyObject();

       o.find();
    }
}
