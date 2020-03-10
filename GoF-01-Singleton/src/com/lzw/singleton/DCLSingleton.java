package com.lzw.singleton;

//DCL懒汉式
public class DCLSingleton {

    //类初始化的时候，不立即加载该对象
    private volatile static DCLSingleton dclSingleton;

    //构造器私有，只允许内部实例化
    private DCLSingleton() {
    }

    //外部获取该类实例
    public static DCLSingleton getInstance() {
        if (dclSingleton == null)
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null)
                    dclSingleton = new DCLSingleton();
            }
        return dclSingleton;
    }

    public static void showMessage() {
        System.out.println("这是DCL懒汉式的实例");
    }
}


//测试类
class DCLSingletonTest {
    public static void main(String[] args) {
        //得到实例1
        DCLSingleton dclSingleton1 = DCLSingleton.getInstance();
        //得到实例2
        DCLSingleton dclSingleton2 = DCLSingleton.getInstance();
        //判断得到的两个实例是否是同一个
        System.out.println(dclSingleton1 == dclSingleton2);
        //调用实例中的方法
        dclSingleton1.showMessage();
    }
}