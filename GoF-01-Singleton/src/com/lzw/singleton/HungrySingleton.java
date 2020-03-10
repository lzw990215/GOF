package com.lzw.singleton;

//饿汉式
public class HungrySingleton {

    //类初始化的时候，立即加载该对象
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //构造器私有，只允许内部实例化
    private HungrySingleton() {
    }

    //外部获取该类实例
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    public void showMessage() {
        System.out.println("这是饿汉式的单例");
    }
}

//测试类
class HungrySingletonTest {
    public static void main(String[] args) {
        //得到实例1
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        //得到实例2
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        //判断得到的两个实例是否是同一个
        System.out.println(hungrySingleton1 == hungrySingleton2);
        //调用实例中的方法
        hungrySingleton1.showMessage();
    }
}
