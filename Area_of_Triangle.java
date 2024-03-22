import java.util.Scanner;
public class Area_of_Triangle {

    public static void main(String[] args) {
        
        System.out.println("Enter the value of Base : ");
        Scanner base_count = new Scanner(System.in);
        float base = base_count.nextFloat();

        System.out.println("Enter the value of Height : ");
        Scanner height_count= new Scanner(System.in);
        float Height= height_count.nextFloat();

        float Area_of_Triangle = 0.5f * (Height * base);

        System.out.println("Calculated Area is = " + Area_of_Triangle);

    }
    
}
