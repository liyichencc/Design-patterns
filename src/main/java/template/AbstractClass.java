package template;

/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.09 11:48
 */
public abstract class AbstractClass {

    /**
     *  模板方法，由它去编排。
     */
    public final void abstractMethod() {
        clearBean();
        putInMachine();

        makeSoybeanMilk();

        System.out.println("结束了...");
    }

    public void clearBean() {
        System.out.println("这是第一步，洗豆子....");
    }

    public void putInMachine() {
        System.out.println("这是第二步骤，大家都一样，放入豆浆机");
    }

    /**
     *  抽象方法，具体子类去实现。
     */
    public abstract void makeSoybeanMilk();
}
