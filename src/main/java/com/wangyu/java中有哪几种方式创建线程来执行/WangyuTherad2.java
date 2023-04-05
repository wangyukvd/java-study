package com.wangyu.java中有哪几种方式创建线程来执行;

public class WangyuTherad2 implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new WangyuTherad2());
        thread.start();
    }

    @Override    //接口调用必须声明
    public void run() {
        System.out.println("hello world");
    }

    //总结实习Runnable接口，实现run()方法，使用依然要用到Thread,这种方法更常用
}
