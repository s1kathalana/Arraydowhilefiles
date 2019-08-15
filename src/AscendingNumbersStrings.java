// sorting numerical and string array
import java.util.Arrays;
import java.util.Scanner;

public class AscendingNumbersStrings {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of numerical array ");//no. of elements in array
        int n= scanner.nextInt();
        System.out.println("enter values");
        int num[]= new int [n];
        for(int s=0;s<n;s++)
        { num[s]= scanner.nextInt();}//user enters values for elements in the array
        int c;
        for(int i=0;i<4 ;i++)//outloop compares first number with second no. set up inside another for loop
        {
            for(int j=i+1; j<4; j++)
            {
                if(num[i]>num[j])
                {
                    c = num[i];
                    num[i] = num[j];
                    num[j] = c;
                }
            }
        }

        for(int k=0;k<4;k++){

        System.out.println(num[k]);}
        System.out.println("enter length of String array");
        int p = scanner.nextInt();
        String city[]= new String[p];
        System.out.println("enter string values");
        for(int x=0;x<p;x++){
            city[x]=scanner.next();}
        Arrays.sort(city);
        for(int g=0;g<p;g++){
        System.out.println(city[g]);}
    }
}
