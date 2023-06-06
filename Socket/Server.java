package SOCKET;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket skt = new ServerSocket(12347); // Create a server socket on port 12345

            System.out.println("Server started. Waiting for client...");

            Socket cs = skt.accept(); // Wait for a client to connect

            System.out.println("Client connected.");

            // Get input and output streams for communication
            BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter pr = new PrintWriter(cs.getOutputStream(), true);

            // Read messages from the client and respond
            String clientMessage;
            while ((clientMessage = br.readLine()) != null) 
            {
                System.out.println("Client: " + clientMessage);

                // Send a response back to the client
                pr.println("Server received: " + clientMessage);
            }

            // Close the connections
            br.close();
            pr.close();
            cs.close();
            skt.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
