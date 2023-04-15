import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns:");
        int n = scanner.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        System.out.println("Input Matrix A");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("A["+i+"]["+j+"]= ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("You've entered A = ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n-1; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(a[i][n-1]+" ");
        }

        System.out.println("Input Matrix B");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("B["+i+"]["+j+"]= ");
                b[i][j] = scanner.nextInt();
            }
        }
        System.out.println("You've entered B = ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n-1; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println(b[i][n-1]+" ");
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("result A + B = ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n-1; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(c[i][n-1]+" ");
        }

        scanner.close();
    }
}
