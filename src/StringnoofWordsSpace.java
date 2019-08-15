import java.util.Scanner;

public class StringnoofWordsSpace
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");//user enters full sentence
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();//every single character of the sentence is stored in ch array.
        int number =0;
        for (int n = 0; n < ch.length; n++)//counter stops when space is detected
        {
            if(ch[n]==' ')
            {
                number = number+1;//counter to counts space
            }
        }
        System.out.println("no. of words are  "+(number+1));//prints  number of words
        System.out.println("no. of spaces are "+number);//prints number of space
    }
}

