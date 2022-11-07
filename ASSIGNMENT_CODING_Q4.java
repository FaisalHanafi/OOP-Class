import java.util.Scanner;
public class ASSIGNMENT_CODING_Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int j = 0;
        do{
            System.out.println("Enter your score :");
            int mark = input.nextInt();
            j = mark;
            if(mark >= 50 && mark <= 100)
            {
                System.out.println("You pass the exam");
            }
            else if(mark >= 0 && mark < 50)
            {
                System.out.println("You fail the exam");
            }
            else 
            {
                System.out.println("Wrong input has been submitted");
            }
            
            
        }
        while(j != -1);
    }
}
