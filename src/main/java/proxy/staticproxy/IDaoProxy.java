package proxy.staticproxy;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.07 17:19
 */
public class IDaoProxy implements IDao {

    private IDao dao;

    public IDaoProxy(IDao iDao) {
        this.dao = iDao;
    }

    @Override
    public void find() {
        System.out.println("对目标对象进行增强。。。。");

        dao.find();

        System.out.println("对目标对象增强完成。。。。");
    }

}
