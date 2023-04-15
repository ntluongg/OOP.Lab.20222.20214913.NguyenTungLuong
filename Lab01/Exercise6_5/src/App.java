import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        int[] array = new int[n];

        for(int i=0; i<n; i++){  
            //reading array elements from the user   
            System.out.print("a["+ i +"]= ");
            array[i]=scanner.nextInt();  
        }  

        Arrays.sort(array);

        System.out.println("Array elements (sorted) are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<n; i++){  
            System.out.print(array[i]+" ");
        }  
        
        scanner.close();
    }
}
