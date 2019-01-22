package lazy;

/**
 * 测试端
 * @author shengwu ni
 */
public class Client {
    public static void main(String[] args) {
        Monitor monitor1 = Monitor.getMonitor();
        Monitor monitor2 = Monitor.getMonitor();
        // 结果为true，说明是同一对象
        System.out.println(monitor1 == monitor2);
    }
}
