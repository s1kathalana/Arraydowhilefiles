import java.util.Scanner;

public class FiveDigitNumberAndsumofIt {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any five digit number");//user enter any five digit number
        int n= scanner.nextInt();
        int p=0;
        int sum=0;
        while(n>0)//separate digit and sum in the predefined sum counter.
        { p=n%10;
         sum=sum+p;
         n=n/10;}

        System.out.println(sum);




    }
}
