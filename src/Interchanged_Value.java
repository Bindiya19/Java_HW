//WAP to input any two numbers and then print their interchanged value
import java.util.Scanner;
public class Interchanged_Value
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = scanner.nextInt();

        int interchangedValue = firstNum;
        firstNum = secondNum;
        secondNum = interchangedValue ;

        System.out.println("After interchanged the value of:");
        System.out.println("First number is : " + firstNum);
        System.out.println("Second number is : " + secondNum);


    }
}
