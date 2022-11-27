package com.testdemo.demo6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
//        tcp

        ServerSocket serverSocket = new ServerSocket(6666);

//        为服务器创建scok
        Socket socket = serverSocket.accept();

//        创建输入流，从服务器读取数据
        InputStream inputStream = socket.getInputStream();
        byte[] ServerBuffer = new byte[1024];
        int length = 0;
        length = inputStream.read(ServerBuffer);
        System.out.println("服务端接收到的是:"+new String(ServerBuffer,0,length));

//        获取socket输出流对象,向客户端发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端你好!hello LuoZilin:Hello Server，I receve your information".getBytes());

//        关闭服务端
        serverSocket.close();

    }
}
