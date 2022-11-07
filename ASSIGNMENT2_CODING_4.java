import java.util.Scanner;
import java.math.*;
public class ASSIGNMENT2_CODING_4
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner (System.in);
       
       double num1=0;
       int continue1 = 0;
        do{
       System.out.println("Please put an integer to test if it is a perfect number or not");
       
       num1 = input.nextDouble();
       
       System.out.println(isPerfect(num1));
       System.out.println("Input -1 to exit the program");
       continue1 = input.nextInt();
    }while(continue1 != -1);
}
    
   public static boolean isPerfect(double input1) 
   {
        int sum = 0;
        
        for(int i=1;i<=input1/2;i++)
        {
            if(input1%i == 0)
            {
                sum += i;
            }
        }
        
        if(sum == input1)
        {
            System.out.println("It is a perfect number");
            return true;
        } 
        else 
        {
            System.out.println("It is not a perfect number");
            return false;
        }
        
        
    }
    

    

}
