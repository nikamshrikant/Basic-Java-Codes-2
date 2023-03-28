import java.lang.*;
import java.util.*;
class code8
{
    public static void main(String[] args)
    {
        int sellingPrice;
        int costPrice;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Selling & Cost Prices : ");
        sellingPrice=sc.nextInt();
        costPrice=sc.nextInt();
        if(sellingPrice>costPrice)
        {
            System.out.println("Profit of = " + (sellingPrice-costPrice));
        }
        else if(costPrice>sellingPrice)
        {
            System.out.println("Loss of = " + (costPrice-sellingPrice));
        }
        else 
        {
            System.out.println(" No Profit , No Loss Gained ");
        }
    }
}