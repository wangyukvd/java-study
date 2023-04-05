package com.wangyu.java中有哪几种方式创建线程来执行;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
//实习Callable接口
public class WangyuTherad4 implements Callable<String> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask=new FutureTask<>(new WangyuTherad4());
        Thread thread=new Thread(futureTask);
        thread.start();
        String result = futureTask.get();
        System.out.println(result);
    }

    @Override
    public String call() throws Exception {
        return "hello wangyu";
    }
    //总结，实现Callable接口，实现call（）方法，得使用Thread+FUtureTask配合，这种方式支持拿到异步执行任务的结果
}
