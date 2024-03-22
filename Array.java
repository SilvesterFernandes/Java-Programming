import java. util. Arrays;
public class Array {



  public static void main(String[] args) {
    
    int [] array= {21,22,23,24,25,26,27,28,29,30};

    for (int i=0; i<=array.length;i++)
    {
        System.out.println("Element at index" + i + ":"+array);
    }


    String [] Fruits ={"Apple","Mango","Grapes","Bananaa","Mango","Orange","Z"};

    System.out.println("Without Sorting ::"+ Fruits);
    Arrays.sort(Fruits);

    System.out.println("Sorted arrays as follows :: ");

    for (String Given_Fruits : Fruits)
    {
        System.out.println(Given_Fruits);
    }

    for (int j=0; j<=Fruits.length;j++)
    {
        System.out.println("Fruit Index at "+ j+ "::"+ Fruits[j]);
    
    }

  }
    
}
