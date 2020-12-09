package proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.09 10:13
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;


    public ProxyFactory(Object t) {
        this.target = t;
    }

    /**
     *  这个方法目的在于返回一个代理对象
     * @return
     */
    public Object getProxyInstance() {
        // 设置工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类，即代理对象
        return enhancer.create();
    }

    /**
     *  重写 intercept ，会调用目标对象的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib 代理模式 ");

        Object invoke = method.invoke(target, objects);

        System.out.println("cglib 完成");
        return invoke;
    }
}
