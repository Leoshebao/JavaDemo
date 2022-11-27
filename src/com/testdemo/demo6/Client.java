package com.testdemo.demo6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
//        建立tcp服务
        Socket socket = new Socket(InetAddress.getLocalHost(),6666);

//        获取Socket的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务端你好,Hello WangHuiWEN:Hello Client good afternoon".getBytes());

//        获取输入流对象,读取服务端回送的数据
        InputStream inputStream = socket.getInputStream();
        byte[] Clientbuffer = new byte[1024];
        int length = inputStream.read(Clientbuffer);
        System.out.println("客户端收到的是:"+new String(Clientbuffer,0,length));

        socket.close();
    }
}
