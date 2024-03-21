//WAP to input any year like 1989 and find out if it is leap year
import java.util.Scanner;

public class Find_Out_Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year.");
        int year = scanner.nextInt();
        if (year % 4 == 0) // use == operator
        {
            System.out.println("This year is leap year.");
        } else {

            System.out.println("This year is not leap year. ");
        }
    }

}

