package com.wangyu.TCP协议学习.作业1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**

 * 使用tcp协议 客户端可以一直发送数据给服务器端，服务器端可以一直接受到客户端发送的数据。
 * 如果客户端输入 666 就会直接退出程序。
 */
public class TcpClinet {
    public static void main(String[] args) throws IOException {

        while (true) {
            // 创建socket对象
            Socket socket = new Socket("127.0.0.1", 8080);
            System.out.println("客户端：请输入发送数据的内容");
            Scanner sc = new Scanner(System.in);
            String context = sc.nextLine();
            if (context.equals("666")) {
                break;// 退出循环
            }
            // 获取getOutputStream
            OutputStream outputStream = socket.getOutputStream();
            // 写入数据给服务器端
            outputStream.write(context.getBytes());
            // 接受服务器端响应的内容
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            System.out.println("服务端响应数据给客户端：" + new String(bytes, 0, len));
            outputStream.close();
            socket.close();
        }

    }
}