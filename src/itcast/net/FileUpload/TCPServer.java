package itcast.net.FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现步骤：
 * 1.创建一个服务器Serversocket对象，和系统要指定的端口号
 * 2.使用Serversocket对象中的方法accept，获取到请求的客户端Socket对象
 * 3.使用Socket对象中的方法get Inputstream，获取到网络字节输入流Inputstream对象
 * 4.判断d:\\upload文件夹是否存在，不存在则创建
 * 5.创建一个本地字节输出流FiLeOutputstream对象，构造方法中绑定要输出的目的地
 * 6.使用网络字节输入流Inputstream对象中的方法read，读取客户端上传的文件
 * 7.使用本地字节输出流FileOutput stream对象中的方法write，把读取到的文件保存到服务器的硬盘上
 * 8.使用Socket对象中的方法getoutputstream，获取到网络字节输出流outputstream对象
 * 9.使用网络字节输出流Outputstream对象中的方法write，给客户端回写”上传成功”
 * 10.释放资源（FileOutputstream，Socket，ServerSocket）
 *
 * @author Huxzhi
 * @date 2020/8/3
 */

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        InputStream is= socket.getInputStream();
        File file =new File("d:\\upload");
        if (!file.exists()){
            file.mkdir();
        }
        FileOutputStream fos=new FileOutputStream(file+"\\1.jpg");
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        socket.getOutputStream().write("上次成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }
}
