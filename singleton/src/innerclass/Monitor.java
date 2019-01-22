/*
 *
 * Copyright (C) 1999-2014 IFLYTEK Inc.All Rights Reserved.
 *
 * FileName：design-mode
 *
 * Description：
 *
 * History：
 * Version   Author      Date            Operation
 * 1.0	     admin    2019/1/1717:18	  Create
 */
package innerclass;

/**
 * 班长类--使用静态内部类实现单例模式
 * “结合了懒汉式+饿汉式”
 * @author shengwu ni
 */
public class Monitor {

    public static String CLASS_INFO = "通信工程（1）班";

    /**
     * 静态内部类，用来创建班长对象
     */
    private static class MonitorCreator {
        private static Monitor monitor = new Monitor();
    }
    private Monitor() {}

    public static Monitor getMonitor() {
        return MonitorCreator.monitor;
    }
}
