import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Month;

        System.out.println("Enter birth month number");
        Month = input.nextInt();
        if (Month >= 1 && Month <= 12) {
            System.out.println("Your birth month is :" + Month);
        } else {
            System.out.println("Invalid month number");
        }
    }
}
