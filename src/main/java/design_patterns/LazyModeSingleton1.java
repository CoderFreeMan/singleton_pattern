package design_patterns;

/**
 * <p> Date             :2018/4/23 </p>
 * <p> Module           : </p>
 * <p> Description      :
 *     饿汉模式，双检查锁的单例模式，线程安全的;
 *     私有的构造方法
 *     public static 的获取此类实例的方法
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
public final class LazyModeSingleton1 {

    private static volatile LazyModeSingleton1 instance;

    private LazyModeSingleton1() {
        if (null != instance) {
            throw new IllegalArgumentException("实例: " + LazyModeSingleton1.class + "已存在");
        }
    }

    public static LazyModeSingleton1 getInstance() {
        LazyModeSingleton1 localInstance = instance;
        if (null == instance) {
            synchronized (LazyModeSingleton1.class) {
                localInstance = instance;
                if (null == localInstance) {
                    instance = localInstance = new LazyModeSingleton1();
                }
            }
        }
        return localInstance;
    }

}
