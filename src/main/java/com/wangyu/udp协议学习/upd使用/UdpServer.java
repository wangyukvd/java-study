package com.wangyu.udp协议学习.upd使用;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        // 创建DatagramSocket接受
        DatagramSocket ds =
                new DatagramSocket(8080);
        // 创建Scanner
        while (true) {
            //2.接收数据
            byte[] bytes = new byte[1024];
            // 数据包的形式接受
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            System.out.println("服务器端接受到数据:" + new String(dp.getData()));
        }
//        ds.close();

    }
}