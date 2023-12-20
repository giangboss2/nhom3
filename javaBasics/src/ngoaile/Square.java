package ngoaile;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int nun;
        System.out.println("enter an integer :");
        nun=scanner.nextInt();
        System.out.println("The square: "+ nun +" is:"+nun*nun);
    }
}
