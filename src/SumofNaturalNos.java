import java.util.Scanner;

public class SumofNaturalNos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter how many natural numbers you want have sum of ");//sets no. of elements in array
        int n= scanner.nextInt();
        int array[]= new int[n];
        int sum =0;
        System.out.println("please enter their values");

        for(int i=0;i<n;i++){array[i]= scanner.nextInt();}//scanner to enter values of array's elements

        for (int i = 0; i <n; i++)//counter to count sum of natural nos.
        {
            sum =sum + array[i];
        }
        System.out.println("sum is  "+sum);//prints sum
    }
}

