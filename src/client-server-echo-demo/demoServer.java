/**
 * Created by think on 2017/3/26.
 */

import java.io.*;
import java.net.*;


public class Server {
    public static void main(String[] args) {
        try{
//            int serverPort = Integer.parseInt(args[0]);
            int serverPort = 8080;
            ServerSocket socket = new ServerSocket(serverPort);

            while(true) {
                System.out.println("Listening...");
                new MultiThread(socket.accept()).start();
//                socket.close();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
