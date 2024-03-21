//WAP input any five number and then find average of five numbers
import java.util.Scanner;

public class Average_Of_Five_Numb
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
   System.out.println("Enter any five numbers: ");

        int num1= scanner.nextInt();
        int num2=scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        int num5= scanner.nextInt();
        float average= (num1+num2+num3+num4+num5)/5;
        System.out.println("Average of given numbers is: "+ average);
    }
}
