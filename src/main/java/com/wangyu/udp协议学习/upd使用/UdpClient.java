package com.wangyu.udp协议学习.upd使用;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

     /*   使用udp协议 客户端可以一直发送数据给服务器端,
        服务器端可以一直接受到客户端发送的数据。
        如果客户端输入 666 就会直接退出程序。*/


    public class UdpClient {
        public static void main(String[] args) throws IOException {
            // 创建DatagramSocket发送者
            DatagramSocket ds =
                    new DatagramSocket();
            // 创建Scanner
            while (true) {
                System.out.println("客户端:请输入发送的内容");
                Scanner sc = new Scanner(System.in);
                String context = sc.nextLine();
                if ("666".equals(context)) {
                    System.out.println("退出程序...");
                    break;
                }
                byte[] data = context.getBytes();
                // 封装数据包
                DatagramPacket dp =
                        new DatagramPacket(data, data.length, InetAddress.getByName("test.mayikt.com"), 8080);
                ds.send(dp);
                System.out.println("发送数据成功...");
            }
            ds.close();
        }
    }

