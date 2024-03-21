import java.util.Scanner;

public class Find_Sales_Commission
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter sale's ID : ");
        int salesId=scanner.nextInt();

        System.out.print("Enter seller's Name : ");
        String name=scanner.next();

        System.out.print("Enter sales Amount : ");
        double salesAmount=scanner.nextDouble();

        System.out.print("Enter Basic salary : ");
        double basicSalary=scanner.nextDouble();

        double commissionPercentage;

        if (salesAmount >= 50000)
        {
            commissionPercentage = 0.35;
        }
        else if (salesAmount >= 30000)
        {
            commissionPercentage = 0.20;
        }
        else if (salesAmount >= 20000)
        {
            commissionPercentage = 0.10;
        }
        else if (salesAmount >= 10000)
        {
            commissionPercentage = 0.05;
        }
        else
        {
            commissionPercentage = 0.02;
        }
        double commission = salesAmount * commissionPercentage;
        System.out.println("Sales Commission : " +commission);


    }
}
