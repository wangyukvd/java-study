package com.example.test1;
import java.util.Scanner;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            System.out.println("请输入一个数a");
            int a = in.nextInt();
            System.out.println("请输入一个数b");
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}