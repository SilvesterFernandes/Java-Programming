import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Enter Your Text : ");
        Scanner input_String= new Scanner(System.in);
        String Input= input_String.nextLine();

        System.out.println("Your Text is : " + Input);

    }
}