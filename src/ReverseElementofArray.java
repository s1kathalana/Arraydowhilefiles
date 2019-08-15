import java.util.Scanner;

public class ReverseElementofArray
{
    public static void main(String args[])
    {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of an array");//enter the no. of elements in array
        int n= scanner.nextInt();
        int array []= new int[n];
        System.out.println("enter values");//enter the values for elements in array
        for(int i=0;i<n;i++)//for loop for scanning  the values for elements in array
        {
         array[i]=scanner.nextInt();
        }
        for(int p=n-1;p>=0;p--)//set up the counter in descending order
        {
            System.out.println(array[p]);
        }
    }

}