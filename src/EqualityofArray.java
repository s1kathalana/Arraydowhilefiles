import java.util.Arrays;
import java.util.Scanner;

public class EqualityofArray
{
    public static void main(String args[])
    {
        int[] array1 = {2, 4, 5, 8};//predefined elements of array1
        int[] array2 = {2, 4, 3, 6, 8};//predefined elements of array2

        if (Arrays.equals(array1,array2))//compare values between two arrays
        {
            System.out.println("arays are equal");//if equals then prints equals
        }
        else  System.out.println("arrays are not equal");//if not equal prints not equal
    }

}

