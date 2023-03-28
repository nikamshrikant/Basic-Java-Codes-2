import  java.util.*;
class code10
{
    public static void main(String[] args)
    {
        int age;
        int discountKids=50;
        int discountOld=20;
        int discountTeen=10;
        int ticketPrice=300;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age: ");
        age=sc.nextInt();
        if(age<=10)
        {
            System.out.println("Eligible for offer ,  Price = " + (ticketPrice-discountKids));
        }
        else if(age<=18)
        {
            System.out.println("Eligible for offer , Price = " + (ticketPrice-discountTeen));
        }
        else if(age>=50)
        {
            System.out.println("Elible for offer , Price = " + (ticketPrice-discountOld));
        }
        else 
        {
            System.out.println("Your Age is not Eliginle for Offer , Fix Price = " + (ticketPrice));
        }
    }
}