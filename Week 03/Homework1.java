package homework;
import java.util.Scanner;
public class Addition 
{
   // main method begins execution of Java application
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number1;
      int number2; 
      int mode;
      int sum=0; 
      System.out.print("Enter first integer:");  
      number1 = input.nextInt(); 
      System.out.print("Enter second integer:");  
      number2 = input.nextInt(); 
      System.out.print("select mode:");  
      mode=input.nextInt();
      if (mode==1)
    	   sum = number1 + number2;
      else if (mode==2)
    	   sum = number1 - number2;
      else if (mode==3)
    	   sum = number1 * number2;
      else if (mode==4)
    	   sum = number1 / number2;
      
      System.out.printf("Sum is %d%n", sum); 

   }
}