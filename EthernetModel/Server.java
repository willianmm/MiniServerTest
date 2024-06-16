package EthernetModel;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Waiting for clients...");
        ServerSocket ss = new ServerSocket(8080);
        Socket soc = ss.accept();
        System.out.println("connection established");
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        double number = Double.parseDouble(in.readLine());
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println("The Server says that Root of: " + number + " is " + squareRoot(number));
        ss.close();
    }
    static double squareRoot(double number){
        return Math.sqrt(number);

    }
}
