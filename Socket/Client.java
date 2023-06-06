package SOCKET;

import java.io.*;
import java.net.Socket;

public class Client 
{
    public static void main(String[] args) 
    {
        try 
        {
            Socket cs = new Socket("localhost", 12347); // Connect to the server on localhost:12345

            // Get input and output streams for communication
            BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter pr = new PrintWriter(cs.getOutputStream(), true);

            // Send messages to the server
            pr.println("Hello, server!");
            pr.println("How are you?");
            pr.println("Exit");

            // Read responses from the server
            String serverResponse;
            while ((serverResponse = br.readLine()) != null)
            {
                System.out.println("Server: " + serverResponse);

                // Exit loop if server sends "Exit"
                if (serverResponse.equals("Exit")) 
                {
                    break;
                }
            }

            // Close the connections
            br.close();
            pr.close();
            cs.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
