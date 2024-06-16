package EthernetModel;
import java.io.*;

import java.net.Socket;

public class  Client {
    public static void main(String[] args) throws Exception {
        System.out.println("New client");
        Socket soc = new Socket("LocalHost", 8080);
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number");
        double number = Double.parseDouble(inFromClient.readLine());
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println(number);
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(in.readLine());
        soc.close();



    }
}
