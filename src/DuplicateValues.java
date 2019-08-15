import java.util.Scanner;

public class DuplicateValues
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of an array");//defines no. of elements in array
        int n= scanner.nextInt();
        int array []= new int[n];
        System.out.println("enter values");
        for(int i=0;i<n;i++)//scanner is set for values for elements in array
        {
            array[i]=scanner.nextInt();
        }

        for(int s=0;s<n;s++)//sets first no to be compared with another number inside another for loop.
        {
            for(int k=s+1;k<n;k++)
            {
                if(array[s]==array[k])  {
                    System.out.println("common no.is "+array[s]);}//if equals then prints common values.
            }

        }

    }
}
