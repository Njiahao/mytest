package com.itheima_0;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp {
    public static void main(String[] args) throws Exception {
        //创建 接收端平台
        ServerSocket sc = new ServerSocket(10086);
        //监听 客户端
        Socket s = sc.accept();
        InputStream is = s.getInputStream();
        byte [] by = new byte[1024];
      int read = is.read(by);
        String s1 = new String(by,0,by.length);
        System.out.println(s1);

    }
}
