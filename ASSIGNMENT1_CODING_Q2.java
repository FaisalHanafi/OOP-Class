import java.util.Scanner;
public class ASSIGNMENT1_CODING_Q2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      int size;
      String original, reverse = "";
        
      System.out.println("Please enter a three-digit integer");  
      
      original = input.nextLine();
      size = String.valueOf(original).length();
      if (size != 3) 
                { 
		System.out.println("Wrong Input");
		}
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println( original +" is a palindrome.");  
      else  
         System.out.println( original + " not a palindrome.");
}
}
