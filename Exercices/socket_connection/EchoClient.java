import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) {
        try{
            
            System.out.println("Client Started");
            
            Socket socket = new Socket("localhost", 5000);
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter a number");
            
            int num = Integer.parseInt(userInput.readLine());
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            out.println(num);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println(in.readLine());
            
            socket.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}