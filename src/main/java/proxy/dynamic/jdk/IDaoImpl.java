package proxy.dynamic.jdk;


/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.07 17:24
 */
public  class IDaoImpl implements IDao {
    @Override
    public void find() {

        System.out.println("正常查询的方法。。。。");
    }
}
