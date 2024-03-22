import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        Scanner addition= new Scanner(System.in);
        
        System.out.print("Enter the value of First Number : ");
        int num1= addition.nextInt();

        System.out.print("Enter the value of second Number : ");
        int num2= addition.nextInt();


        int sum=num1+num2;

        System.out.println("Sum of given Numbers is : " + sum);

// For String


    }


    
    
}
