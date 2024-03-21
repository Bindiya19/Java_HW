//WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A, +>= 60 A,>= 50 B, >= 35 C


import java.util.Scanner;

public class Find_Result_On_basis_Pct
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter student name :");
        String studentName=scanner.next();
        System.out.print("Enter Student roll no :");
        int rollNo=scanner.nextInt();

        System.out.println("Enter 3 subjects marks :");
        System.out.print("Marks of science is : ");
        int scienceMarks=scanner.nextInt();

        System.out.print("Marks of Maths is : ");
        int mathsMarks=scanner.nextInt();

        System.out.print("Marks of English is : ");
        int englishMarks=scanner.nextInt();

        int totalMakrs = (scienceMarks + mathsMarks + englishMarks);
        System.out.println("Total numbers of marks is : " +totalMakrs);

        float pctoftotalmarks=(float) totalMakrs/3;
        System.out.println("Percentage is : "+pctoftotalmarks );


        String result, grade;
        if (pctoftotalmarks>=80)
        {
            result ="Distinction";
            grade="A+";
        }
        else if (pctoftotalmarks>=60)
        {
            result="First Class";
            grade ="A";
        }
        else if(pctoftotalmarks>=50)
        {
            result= "Second Class";
            grade="B";
        }
        else if (pctoftotalmarks>=35)
        {
           result="Pass Class";
           grade="c";
        }
        else
        {
        result="Fail";
        grade="N/A";

        }
        System.out.println("Result is :"+result);
        System.out.println("Grade is : "+grade);

    }


}
