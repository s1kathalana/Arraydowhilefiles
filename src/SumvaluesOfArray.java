import java.util.Scanner;

public class SumvaluesOfArray
{
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of array");//no. of elements in array
        int n = scanner.nextInt();
        System.out.println("enter values");
        int number []= new int[n];
        for(int i=0;i<n;i++)//scanner to enter values for elements in array
        {
            number[i] = scanner.nextInt();
        }
        int sum = number[0];//sets counter for counting sum
            for(int s=1;s<n;s++)
        {
            sum = sum +number[s];//counter for adding sum previously set to zero.
        }
        System.out.println("sum  ="+sum);//prints sum
    }
}
