import java.util.*;

import javax.lang.model.util.ElementScanner14;
class code2
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Numbers = ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1%2==0 && num2%2!=0)
        {
           System.out.println(" num1 is Even Number & num2 is odd number ");
        }
        else if(num2%2==0 && num1%2!=0)
        {
            System.out.println(" num2 is Even Number & num1 is Odd number");
        }
        else if(num1%2==0 && num2%2==0)
        {
            System.out.println(" num1 & num2 both are Even numbers");
        }
        else{
            System.out.println("num1 & num2 both are Odd numbers ");
        }
        
    }
}