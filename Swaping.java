import java.util.Scanner;
  
class Swaping
{
   public static void main(String args[])
   {
      int x, y;
     
     
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter x ");
      x = in.nextInt();
      System.out.println("Enter y");
      y = in.nextInt();
  
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
  
      x = x + y;
      y = x - y;
      x = x - y;
  
      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
   }
}