import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number");//user enter any number
        int n= scanner.nextInt();
        int q=n;
        int p=0;
        int sum=0;
        while(n>0)//separate digit multipy by 10 and add in predefined counter and add them in sum
        { p=n%10;
          sum=(sum*10)+p;
          n=n/10;}

        if(q==sum){//if both numbers are equal then its palindrom number
            System.out.println("palindrom number");}
            else
                System.out.println("not a palindrom number");
    }
}
