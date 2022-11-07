import java.util.Scanner;
public class ASSIGNMENT_CODING_Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num1,smallest,secsmallest=0;
        
        num1 = input.nextInt();
        smallest =num1;
        while(num1 != -1)
        
        {
            num1 = input.nextInt();
            if( num1 == -1)
            {
                break;
            }
            
            if(smallest > num1)
            { secsmallest = smallest; 
              smallest = num1;
            }
    }
    System.out.println("Smallest: "+ smallest + secsmallest);
}
}
