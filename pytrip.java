import java.util.*;
class pytrip
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1*num1+num2*num2==num3*num3)
        {
           System.out.println("it is a Pythagoras Triplet");
        }
        else{
            System.out.println("it is not a Pythagoras Triplet");
        }
    }
}