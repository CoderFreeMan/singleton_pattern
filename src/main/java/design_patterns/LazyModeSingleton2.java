package design_patterns;

/**
 * <p> Date             :2018/4/23 </p>
 * <p> Module           : </p>
 * <p> Description      :
 *     饿汉模式，方发锁的单例模式，线程安全的;
 *     私有的构造方法
 *     public static synchronized 的获取此类实例的方法
 *     static volatile 未被实例化的此对象
 *     单例模式不能不继承
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
public final class LazyModeSingleton2 {

    private static volatile LazyModeSingleton2 instance;

    private LazyModeSingleton2() {
        if (null != instance) {
            throw new IllegalArgumentException("实例: " + LazyModeSingleton2.class + "已存在");
        }
    }

    public static synchronized LazyModeSingleton2 getInstance() {
        if (null == instance) {
            instance = new LazyModeSingleton2();
        }
        return instance;
    }

}
