package com.wangyu.获取ip代码;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 余胜军
 * @ClassName Test01
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        // 获取给定主机名的的IP地址，host参数表示指定主机
        InetAddress inetAddress = InetAddress.getByName("192.168.91.1");
        // 获取获取本地IP地址的主机名
        String hostName = inetAddress.getHostName();
        // 获取IP地址
        String address = inetAddress.getHostAddress();
        System.out.println("hostName:" + hostName);
        System.out.println("address:" + address);
    }
}