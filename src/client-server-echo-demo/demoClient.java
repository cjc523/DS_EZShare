/**
 * Created by think on 2017/3/26.
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {

//        String domainName = args[0];
//        int serverPort = Integer.parseInt(args[1]);
        String domainName = "localhost";
        int serverPort = 8080;
        String sendData;
        String receiveData;
        Boolean running = true;

        try {
            Socket connection = new Socket(domainName, serverPort);
            System.out.println("Connected");
            DataInputStream in = new DataInputStream(connection.getInputStream());
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());

            while(running) {
                System.out.print("Input a command: ");
                Scanner k = new Scanner(System.in);
                sendData = k.nextLine();
                System.out.println("Sending...");
                out.writeUTF(sendData);
                out.flush();
                if (sendData.equals("logout")) {
                    System.out.print("Closed");
                    connection.close();
                    running = false;
                } else {
                    System.out.println("Sending Completed");
                    System.out.println("Receiving...");
                    receiveData = in.readUTF();
                    System.out.println(receiveData);
                }
            }

//            out.close();
//            connection.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
