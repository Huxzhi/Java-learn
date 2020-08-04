package itcast.net.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/**
 * 1.创建一个本地字节输入流FileInputstream对象，构造方法中绑定要读职的数据源
 * 2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
 * 3.使用Socket中的方法getoutput stream，获取网络字节输出流Outputstream对象
 * 4.使用本地字节输入流FileInputstream对象中的方法read，读取本地文件
 * 5.使用网络字节输出流Outputstream对象中的方法write，把读取到的文件上传到服务器
 * 6.使用Socket中的方法get Inputstream，获职网络字节输入流Inputstream对象
 * 7.使用网络字节输入流Input stream对象中的方法read读取服务回写的数据
 * 8.释放资源（FileInputstream，Socket）
 *
 * @author Huxzhi
 * @date 2020/8/3
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c:\\Users\\Huxzhi\\Pictures\\天气之子-封面.png");
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os=socket.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024];
        //这边没有发送read=-1，会陷入死循环
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        //输出终止符号
        socket.shutdownOutput();
        InputStream is=socket.getInputStream();
        while ((len=is. read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        socket.close();
    }
}
