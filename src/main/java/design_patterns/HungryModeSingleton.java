package design_patterns;

/**
 * <p> Date             :2018/4/23 </p>
 * <p> Module           : </p>
 * <p> Description      :
 *     饿汉模式的单例模式，且是线程安全的;
 *     1. 私有的构造方法
 *     2. 私有的本身实例
 *     3. public static 类型获取该实例的方法
 *     4. 单例不能被继承
 *     5.
 * </p>
 * <p> Remark           : </p>
 *
 * @author yangdejun
 * @version 1.0
 * <p>--------------------------------------------------------------</p>
 * <p>修改历史</p>
 * <p>    序号    日期    修改人    修改原因    </p>
 * <p>    1                                     </p>
 */
public final class HungryModeSingleton {

    /**
     * 私有的构造方法
     */
    private HungryModeSingleton() {
    }

    /**
     * 在此类被加载时创建此对象，所以叫做饿汉模式
     */
    private static final HungryModeSingleton INSTANCE = new HungryModeSingleton();

    /**
     * 获取该实例的方法
     */
    public static HungryModeSingleton getInstance() {
        return INSTANCE;
    }
}
