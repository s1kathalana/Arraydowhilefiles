public class NoDividedby3and5 {
    public static void main(String args[]) {
        System.out.println("numbers divided by 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {//if no. is divisible  by  3 then prints out reminder
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("numbers divided by 5");
        for (int i = 1; i <= 100; i++) {//finds number between 1 and 100
            if (i % 5 == 0) {//if no. divisible by 5 then prints out reminder
                System.out.print(i + ",");
            }
        }
    }
}

