package itcast.net.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        /*
            浏览器解析服务器回写的html页面，页面中如果有图片，那么浏览器就会单独的开启一个线程，读取服务器的图片
            我们就的让服务器一直处于监听状态，客户端请求一次，服务器就回写一次
         */
        while (true) {
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        /*byte[] bytes=new byte[1024];//一次性读1024个字节，
                        int len=0;
                        while ((len=is.read(bytes))!=-1){
                            System.out.println(new String(bytes,0,len));
                        }*/
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //客户端请求信息第一行 GET /itcast/net/web/18160217.html HTTP/1.1
                        String line = br.readLine();
                        System.out.println(line);
                        //读取的信息进行切割只要中间部分
                        String[] arr = line.split(" ");
                        //把前面的“/”也去掉
                        String htmlpath = arr[1].substring(1);
                        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
                        FileInputStream fis = new FileInputStream(htmlpath);
                        //使用Socket中的方法getOutputStream()获取网络字节输出流OutputStream对象
                        OutputStream os = socket.getOutputStream();
                        //写入HTTP协议响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须要写入空行，否则刘览器不解析
                        os.write("\r\n".getBytes());

                        //一读一写复制文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        fis.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
        //server.close();
    }

}
