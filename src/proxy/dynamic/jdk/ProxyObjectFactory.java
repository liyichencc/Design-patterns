package proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.07 17:24
 */
public class ProxyObjectFactory {

    private Object targetObject;

    public ProxyObjectFactory(Object o) {
        this.targetObject = o;
    }


    public Object dynamicProxyObject() {

        Object o = Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(), this.targetObject.getClass().getInterfaces(), (p,m,args) -> {
                System.out.println("开始动态代理.....");
                Object invoke = m.invoke(targetObject, args);
                System.out.println("动态代理结束....");
                return invoke;
        });

        return o;
    }
}
