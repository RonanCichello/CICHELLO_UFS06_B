package org.example;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class App
{
    static final int portNumber = 1234;             // Definiamo la porta

    public static void main( String[] args )
    {
        System.out.println("Server started!");

        ServerSocket serverSocket = null;           // Inizializziamo il Server TCP
        try {
            serverSocket = new ServerSocket(portNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Socket clientSocket = null;                 // Inizializziamo il CLient TCP

        while(true)
        {
            try {
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

            ClientHandler clientHandler = new ClientHandler(clientSocket);
            ElencoAlberghi.getInstance().add(clientHandler);     // Aggiungiamo i client che si connettono alla lista dei client

            Thread thread = new Thread(clientHandler);      // Creiamo un thread per il client
            thread.start();
        }
    }
}
