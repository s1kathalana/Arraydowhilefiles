import java.util.Scanner;

public class SpecificValueInArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int array[]= {5,7,8,9,0};
        System.out.println("please enter position to find specific value at that position");//enters which index position
        int n= scanner.nextInt();
        System.out.println("At entered position  " +n+ "  the specific value is " +array[n]);//prints the value for that index position
    }
}
