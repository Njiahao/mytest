package com.itheima_0;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcpdemo {
    public static void main(String[] args) throws Exception {
        InetAddress lh = InetAddress.getLocalHost();
        Socket s = new Socket(lh,10086);
        OutputStream os = s.getOutputStream();
        os.write("hello 我来了".getBytes());
        s.close();



    }
}
