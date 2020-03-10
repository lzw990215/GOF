package com.lzw.singleton;

//懒汉式
public class LazySingleton {

    //类初始化的时候，不立即加载该对象
    private static LazySingleton lazySingleton;

    //构造器私有，只允许内部实例化
    private LazySingleton() {
    }

    //外部获取该类实例，synchronized关键字保证了线程安全
    public static synchronized LazySingleton getInstance() {
        //如果获取实例时判断到实例还没有创建，则创建该实例
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public void showMessage(){
        System.out.println("这是懒汉式的单例");
    }
}

//测试类
class LazySingletonTest {
    public static void main(String[] args) {
        //得到实例1
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        //得到实例2
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        //判断得到的两个实例是否是同一个
        System.out.println(lazySingleton1 == lazySingleton2);
        //调用实例中的方法
        lazySingleton1.showMessage();
    }
}
