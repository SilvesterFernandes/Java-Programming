public class Swap_Numbers {

    public static void main(String[] args) {
        
        int a = 10;
        int b =20;
        
        System.out.println("Before Swapping a = "+a);
        System.out.println("Before Swapping b ="+b);

        int temp_c=a;

        a=b;
        b=temp_c;

        System.out.println("After Swapping a = " + a);
        System.out.println("After Swapping b = " + b);


 // Swap without using a temporary variable.....

         a = a + b;
         b = a - b;
         a = a - b;

    }

    
    
}
