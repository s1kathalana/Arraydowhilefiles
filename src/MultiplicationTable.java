import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter upto which you want to print multiplication table of ");//sets 3 rows if entered 3
        int n= scanner.nextInt();
        System.out.println("please enter term of upto where you want to muliply to");//sets 3 columns if entered 3
        int t = scanner.nextInt();
        int i=1;
        int k=1;
        do
        {
            do
            {
                System.out.print((k*i)+" ");
                k++;
            }while(k<=t);//loop sets for the row to be printed
            k=1;//resets counter
            System.out.println();
            i++;
        }while(i<=n);//loop sets for the column to be printed
    }
}


