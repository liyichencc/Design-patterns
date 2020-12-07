package proxy.dynamic.jdk;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.07 17:24
 */
public class IDaoImpl implements IDao {
    @Override
    public void find() {

        System.out.println("正常查询的方法。。。。");
    }
}
