
import java.util.Scanner;


public class Addition_userInput {

    public static void main(String[] args) {
         
       Scanner number_1 = new Scanner(System.in);
       System.out.println("Enter Your First Number :  ");
       float num1= number_1.nextFloat();

      
       Scanner number_2= new Scanner(System.in);
       System.out.println("Enter Your Second Number : ");
       float num2= number_2.nextFloat();
      

       float sum= num1+num2;

        System.out.println("The Sum of given Number is : "  + (sum));



    }
    
}
