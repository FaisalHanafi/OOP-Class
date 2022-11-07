import java.util.Scanner;
public class ASSIGNMENT2_CODING_Q3
{
    public static double calculateCharges(int num1)
    {
        double charge=0,trueamount=0,addi,addcharge;
       
        if(num1>0 && num1 < 3)
        {
            trueamount=0;
        }
        else if(num1>=3)
        {
            charge = 2;
            addi = num1-3;
            addcharge = addi*0.5;
            trueamount = addcharge+charge;
            if(trueamount>=10)
            {
            trueamount=10;
            }   
        }
        else
        {
            System.out.println("Invalid input");
        }
        System.out.println("The total charge is: "+trueamount);
        return trueamount;
    }
    public static void main(String[] args)
    {
        int hours=0;
        double sum=0;
        int continue1=0;
        do{
        Scanner input = new Scanner(System.in);
        System.out.println("Amount of hours parked:");
        hours = input.nextInt();
        sum += calculateCharges(hours);
        System.out.println("Input -1 to exit :");
        continue1 = input.nextInt();
        }while(continue1 != -1);
        System.out.println("The total charge for all transaction is: "+sum);
    }
    
}
