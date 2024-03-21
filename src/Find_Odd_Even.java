//Input any two number and find out its odd or even use turnery operator (? :)
import java.util.Scanner;

public  class Find_Odd_Even
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int number_1 = scanner.nextInt();
        String result_1= (number_1 % 2 == 0) ? "Even" : "Odd";// use ?,: ternary operator in conditions
        System.out.println("Given number is : "+result_1);

        System.out.println("Enter any number : ");
        int number_2 = scanner.nextInt();
        String result_2 = (number_2 % 2 == 0 ) ? "Even" : "Odd";
        System.out.println("Given number is : "+result_2);
    }
}