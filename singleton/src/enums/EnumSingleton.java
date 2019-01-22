package enums;

/**
 * 枚举单例模式
 * @author shengwu ni
 */
public enum EnumSingleton {
    INSTANCE;

    private Monitor monitor;

    EnumSingleton() {
        monitor = new Monitor();
    }

    public Monitor getMonitor() {
        return monitor;
    }
}

//public enum EnumSingleton {
//    INSTANCE("通信工程（1）班");
//
//    private String classInfo;
//
//    EnumSingleton(String classInfo) {
//        this.classInfo = classInfo;
//    }
//
//    public String getClassInfo() {
//        return classInfo;
//    }
//    public void setClassInfo(String classInfo) {
//        this.classInfo = classInfo;
//    }
//}
