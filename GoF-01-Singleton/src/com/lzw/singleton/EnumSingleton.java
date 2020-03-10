package com.lzw.singleton;

//枚举
public enum EnumSingleton {
    INSTANCE;

    public void showMessage(){
        System.out.println("这是通过枚举创建的单例");
    }
}

//测试类
class EnumSingletonTest {
    public static void main(String[] args) {
        //得到实例1
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        //得到实例2
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        //判断得到的两个实例是否是同一个
        System.out.println(enumSingleton1 == enumSingleton2);
        //调用实例中的方法
        enumSingleton1.showMessage();
    }
}