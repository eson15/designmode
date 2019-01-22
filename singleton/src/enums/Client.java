package enums;

/**
 * 测试端
 * @author shengwu ni
 */
public class Client {
    public static void main(String[] args) {
        Monitor monitor1 = EnumSingleton.INSTANCE.getMonitor();
        Monitor monitor2 = EnumSingleton.INSTANCE.getMonitor();
        // 结果为true，说明是同一对象
        monitor1.setClassInfo("hahaha");
        System.out.println(monitor1.getClassInfo());
        System.out.println(monitor1 == monitor2);

//        EnumSingleton instance = EnumSingleton.INSTANCE;
//        String classInfo = instance.getClassInfo();
//        System.out.println(classInfo);
    }
}
