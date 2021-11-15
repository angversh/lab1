import java.util.InputMismatchException;
import java.lang.RuntimeException;
import java.util.Scanner;

public class lab1 {
    public lab1() {
    }

    public static void main(String[] arg) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Insert 4 numbers: ");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
            scan.close();
        } catch (InputMismatchException var1) {
            System.out.println("Error. Insert an integer number in the range [-2147483648 до 2147483647].");
            System.exit(1);
        } catch (RuntimeException var2) {
            System.out.println("An error occurred please try again!");
        }
            int min = Math.min(Math.min(a, b), Math.min(c, d));
            System.out.println(min);
        }
    }
