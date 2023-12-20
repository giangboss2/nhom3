package baithi;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 6666);
            DataInputStream din = new DataInputStream(s.getInputStream());
            System.out.println(din.readUTF());
            din.close();
            s.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
