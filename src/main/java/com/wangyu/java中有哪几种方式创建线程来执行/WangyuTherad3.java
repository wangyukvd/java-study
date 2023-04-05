package com.wangyu.java中有哪几种方式创建线程来执行;

public class WangyuTherad3 {
/*    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("hello");
            }
        });
        thread.start();
    }*/
public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("hello");
        });
    thread.start();
    }

}
