mport java.util.Scanner;

public class VoteChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are old enough to vote in a national election.");
        } else {
            System.out.println("You are not old enough to vote in a national election.");
        }
    }
}
