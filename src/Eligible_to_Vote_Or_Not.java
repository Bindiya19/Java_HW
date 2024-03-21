//Write Java program to allow the user to input his/her age. Then the program will show if the
//person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//old.
import java.util.Scanner;

public class Eligible_to_Vote_Or_Not
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=scanner.nextInt();
        // Boolean condition
        boolean ableToVote = age >= 18;
        if (ableToVote)
        {
        System.out.println("You are eligible to vote.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
    }
}


