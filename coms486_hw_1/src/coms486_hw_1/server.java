package coms486_hw_1;
import java.io.*;  
import java.net.*;  
public class server {

    public static void main(String argv[]) throws Exception  
    {  
        String sentence;  
        String modifiedSentence;  
        BufferedReader userIn =  
          new BufferedReader(new InputStreamReader(System.in));  
        Socket clientSocket = new Socket("hostname", 6789);  
        DataOutputStream outToServer =  
          new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader inFromServer =  
                new BufferedReader(new 
                InputStreamReader(clientSocket.getInputStream()));  
              sentence = userIn.readLine();  
              outToServer.writeBytes(sentence + '\n');  
              modifiedSentence = inFromServer.readLine();  
              System.out.println ("FROM SERVER: " + modifiedSentence);  
              clientSocket.close();  
    }
}
