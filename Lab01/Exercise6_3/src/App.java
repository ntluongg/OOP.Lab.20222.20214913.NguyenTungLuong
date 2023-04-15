import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter n:");
        
        int n = scanner.nextInt();  // Read user input

        String stars = "*";
        
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n - i - 1; k++){
                System.out.print(" ");
            }
            System.out.print(stars);
            stars += "**";
            System.out.println();
        }
        scanner.close();
    }
}