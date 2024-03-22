import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        int number;
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Number : " );
     
        number=sc.nextInt();


       for (int i=1; i<=number;i++)
       {
         factorial*=i;

       }

       System.out.println("Factorial of given number"+ " " + number+ " " +"is : "+ factorial);

    }
    
}
