import java.util.Scanner;

public class Odd_Even {



    public static void main(String[] args) {
        
        Scanner user_input_num= new Scanner(System.in);
        
        System.out.print("Enter Your Number : ");

        float number = user_input_num.nextFloat();

       System.out.println((number % 2 == 0) ? "Given number is Even" : "Given Number is Odd");

        if (number % 2 == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given Number is Odd");
        }
    }    

}
