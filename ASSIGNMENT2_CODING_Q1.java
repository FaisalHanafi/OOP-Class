import java.util.Scanner;

public class ASSIGNMENT2_CODING_Q1
{
 public static boolean isMultiple(int num1,int num2)
    {
        boolean result=false;
        if(num2%num1==0)
        {
           result=true; 
        }
        return result;
    }
 public static void main(String[] args)
    {
     
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the 1st integer:");
     int base = input.nextInt();
     System.out.println("Please enter the 2nd integer:");
     int numresult = input.nextInt();
     
     
     System.out.println(isMultiple(base,numresult));
    }
    
    
}
