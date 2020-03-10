package com.lzw.singleton;

//静态内部类
public class InnerSingleton {

    //构造器私有，只允许内部实例化
    private InnerSingleton() {
    }

    //静态内部类
    private static class Inner {
        //在静态内部类中实例化该对象
        private static final InnerSingleton INNER_SINGLETON = new InnerSingleton();
    }

    //外部获取该类实例
    public static InnerSingleton getInstance() {
        return Inner.INNER_SINGLETON;
    }

    public void showMessage() {
        System.out.println("这是静态内部类的实例");
    }
}

//测试类
class InnerSingletonTest {
    public static void main(String[] args) {
        //得到实例1
        InnerSingleton innerSingleton1 = InnerSingleton.getInstance();
        //得到实例2
        InnerSingleton innerSingleton2 = InnerSingleton.getInstance();
        //判断得到的两个实例是否是同一个
        System.out.println(innerSingleton1 == innerSingleton2);
        //调用实例中的方法
        innerSingleton1.showMessage();
    }
}