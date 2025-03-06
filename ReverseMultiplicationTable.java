import java.util.Scanner;

public class ReverseMultiplicationTable {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int [] table1 = new int[10];
        int [] table2 = new int[10];

        System.out.print("Enter a number, you want table of: ");
        int number = in.nextInt();

        System.out.println("Multiplication table of " + number + " and its reverse:");

        for (int i = 0; i < 10; i++) {
            table1[i] = number * (i + 1);
            table2[9 - i] = table1[i];   
            System.out.println(number + " x " + (i + 1) + " = " + table1[i]); 
        }

        System.out.println("\nReversed Multiplication table of " + number + ":");
        for (int i = 0; i<10; i++){
            System.out.println(number + " x " + (10-i) + " = " + table2[i]);
        }

        in.close();
    }
}