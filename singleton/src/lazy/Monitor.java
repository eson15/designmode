package lazy;

/**
 * 班长类-懒汉式
 * @author shengwu ni
 */
public class Monitor {

    /**
     * 首先内部定义一个班长实例
     */
    private static volatile Monitor monitor = null;

    /**
     * 将构造方法私有化，防止外界实例化该对象
     */
    private Monitor() {}

    /**
     * 对外提供一个方法，返回班长对象
     * @return Monitor
     */
    public static Monitor getMonitor() {
        if (monitor == null) {
            synchronized (Monitor.class) {
                if (monitor == null) {
                    monitor = new Monitor();
                }
            }
        }
        return monitor;
    }
}
