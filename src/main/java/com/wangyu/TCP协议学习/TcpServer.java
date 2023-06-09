package com.wangyu.TCP协议学习;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 余胜军
 * @ClassName TcpServer
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        // 创建serverSocket
        ServerSocket serverSocket = new ServerSocket(8090);
        // 监听客户端数据
        Socket socket = serverSocket.accept();
        // 获取到客户端发送的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("客户端发送的数据:" + new String(bytes, 0, len));
        // 关闭资源
        inputStream.close();
        serverSocket.close();

    }
}