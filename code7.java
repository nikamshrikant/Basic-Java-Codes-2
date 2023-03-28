import java.util.*;
class code7
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
       
        if(num1>num2 && num1==num3)
        {
            System.out.println("num1 is greater than num2 & num1 ,num3 are equal ");
        }
        else if(num1>num3 && num1==num2)
        {
            System.out.println("num1 is greater than num3 & num1 ,num2 are equal ");
        }
        else if(num2>num1 && num2==num3)
        {
            System.out.println("num2 is greater than num1 & num2 ,num3 are equal ");
        }
        else if(num2>num3 && num2==num1)
        {
            System.out.println("num2 is greater than num3 & num2 ,num1 are eqaul ");
        }
        else if(num3>num1 && num3==num2)
        {
            System.out.println("num3 is greater than num1 & num3 ,num2 are equal ");
        }
        else if(num3>num2 && num3==num1)
        {
            System.out.println("num3 is greater than num2 & num3 ,num1 are equal ");
        }
        else if(num1>num2 && num1>num3)
        {
            System.out.println("num1 is greater than num2 & num3");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("num2 is greater than num1 & num3");
        }
        else if(num3>num1 && num3>num2)
        {
            System.out.println("num3 is greater than num1 & num2");
        }
        else
        {
            System.out.println("All numbers are Equal ");
        }


    }
}