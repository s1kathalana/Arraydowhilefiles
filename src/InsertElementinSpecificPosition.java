import java.util.Scanner;

public class InsertElementinSpecificPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no. of elements in array");//define the limit of array elements
        int n= scanner.nextInt();
        System.out.println("enter element values");
        int array []= new int[n+1];// define one size bigger because of added elements in existing array

        for(int a=0;a<n;a++){//scanner for entering values for the elements in array
         array [a]= scanner.nextInt();}


        for(int c=0;c<n;c++){
            System.out.println(array[c]);}
        System.out.println("enter position where do u want to add an element");
        int p= scanner.nextInt();
        System.out.println("enter value to be added at that position");
        int q = scanner.nextInt();


        for(int r=n-1;r>=p-1;r--)//reverse counter to put no. in descending order
        {
            array[r+1]=array[r];

        }
        array[p-1]=q;//defines exact position for the extra number to be added

        for(int c=0;c<array.length;c++){//printsout all values for the elements in array
            System.out.println(array[c]);}



    }


}
