package com.wangyu.java中有哪几种方式创建线程来执行;

/*1.直接继承Thread*/
public class WangyuTherad extends Thread {
    public static void main(String[] args) {
        WangyuTherad thread= new WangyuTherad();
        thread.start();   //启动线程
    }

    @Override   //子类重写父类方法  要加的注释
    public void run(){
            System.out.println("你好 王宇");
        }
//总结重写的是run()方法，而不是start()方法，但是占用了继承的名额，java中的类是单继承的。
}
