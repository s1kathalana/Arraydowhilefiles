import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many lines do u want to print");
        int n= scanner.nextInt();
        int array[]= new int[n];

        for (int i = 1; i <=n; i++)//outer loop sets top to bottom counter
        {
            for(int j=1;j<=i;j++)//inner loop sets from left to right
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

