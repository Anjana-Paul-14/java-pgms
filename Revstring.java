import java.io.*;
import java.util.Scanner;
  
class Revstring {
    public static void main (String[] args) {
        
        String  rev="";
        char ch;
	Scanner sc = new Scanner(System.in);
        
      System.out.print("Original word: ");
	String str = sc.nextLine();
      //System.out.println(str); 
        
      for (int i=str.length()-1;i>=0; i--)
      {
        rev=rev + str.charAt(i); 
        
      }
      System.out.println("Reversed word: "+ rev);
    }
}
  