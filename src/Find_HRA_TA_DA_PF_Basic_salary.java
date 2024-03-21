//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%, DA = Basic salary 8% ,TA = Basic salary 9%, PF= Basic salary 20%, Gross salary = basic salary + HRA + TA + DA -PF

import java.util.Scanner;

public class Find_HRA_TA_DA_PF_Basic_salary
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter employee ID : ");
        int employee =scanner.nextInt();

        System.out.print("Enter employee Name : ");
        String name =scanner.next();

        System.out.print("Enter Basic Salary : ");
        double basicsalary=scanner.nextDouble();


        double hra=basicsalary*0.10;
        double DA=basicsalary*0.8;
        double TA=basicsalary*0.9;
        double PF=basicsalary*0.20;
        double grosssalary=(basicsalary+hra+DA+TA+PF);
        System.out.println("Your Gross Salary is : "+grosssalary);


    }
}
