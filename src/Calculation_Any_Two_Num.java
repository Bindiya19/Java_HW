import java.util.Scanner;

//WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)
public class Calculation_Any_Two_Num
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter any first number");
        int num_1=scanner.nextInt();

        System.out.println("Enter any of these symbol +, -, /, *.");
        char symbol=scanner.next().charAt(0);


        System.out.println("Enter any second number.");
        int num_2=scanner.nextInt();
        float result;

         if (symbol=='+')
        {
            result = num_1 + num_2;
            System.out.println("Addition of given number is: " + result);
        }
         else if (symbol=='-')
        {
            result = num_1 - num_2;
            System.out.println("Subtraction of given number is: "+ result);
        }
         else if (symbol=='/')
        {
            result = num_1 / num_2;
            System.out.println("Division of given number is: " +result);
        }
         else if(symbol== '*')
        {
            result = num_1 * num_2;
            System.out.println("Multiplication of given number is: " +result);
        }
         else
         {
             System.out.println("Invalid symbol enter.");
         }

    }
}
