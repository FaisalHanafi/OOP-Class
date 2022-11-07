
public class ASSIGNMENT_CODING_Q6
{
    public static void main(String[] args)
    {
        System.out.println("Pattern 1");
        for(int loop1=1;loop1<7;loop1++)
        {
           for(int inner1=1;inner1<=loop1;inner1++)
           {
               System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Pattern 2");
        for(int loop2=6;loop2>0;loop2--)
        {
           for(int inner2=1;inner2<=loop2;inner2++)
           {
               System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Pattern 3");
        for (int loop3 = 0; loop3 < 6; loop3++) {
            for (int inner3 = loop3; inner3>0; inner3--) {
                System.out.print("  ");
            }
            for (int extra = 1; extra <= 6 - loop3; extra++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
