import java.io.*;
import java.util.Scanner;

  
public class RevWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Original string : ");
 
    String str = sc.nextLine();
    sc.close();
 
    String temp[] = str.split("\\s"); // '\\s' to avoid space in between
    String reverse = "";
 
    
    for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
              reverse = temp[i] + reverse; 
            else
              reverse = " " + temp[i] + reverse; 
        } 
 
    
    System.out.print("Reversed string : " + reverse);
  }
}

