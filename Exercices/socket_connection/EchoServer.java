import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        try {

            System.out.println("Waiting for clients...");

            ServerSocket serverSocket = new ServerSocket(5000);

            Socket socket = serverSocket.accept();

            System.out.println("Connection established");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            int number = Integer.parseInt(reader.readLine());

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Factorial of " + number + " is: " + factorial(number));

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int factorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
