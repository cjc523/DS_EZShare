/**
 * Created by think on 2017/3/26.
 */
import java.net.*;
import java.io.*;

public class MultiThread extends Thread {
    private Socket socket = null;
    private String receiveData;
    private String sendData;
    private Boolean running = true;

    public MultiThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            System.out.println(socket);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while(running) {
                System.out.println("Receiving...");
                receiveData = in.readUTF();
                if (receiveData.equals("logout")) {
                    System.out.println("The socket " + socket + " is now closed.");
                    socket.close();
                    running = false;
                } else {
                    System.out.println(receiveData);
                    System.out.println("Sending...");
                    sendData = "Hello, I've received you message as: " + receiveData;
                    out.writeUTF(sendData);
                    out.flush();
                }
            }


//            out.close();
//            in.close();
//            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}