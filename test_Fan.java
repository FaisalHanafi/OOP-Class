import java.util.Scanner;

public class test_Fan{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        Fan a1 = new Fan();
        Fan a2 = new Fan();
        
        
        
        a1.setspeed(a1.getfast());
        a1.seton(true);
        a1.setradius(10);
        a1.setcolor("Yellow");
        System.out.println(a1.toString());
        
        System.out.print(a2.getmedium());
        a1.seton(false);
        a1.setradius(5);
        a1.setcolor("Blue");
        System.out.println(a2.toString());
        
        
        
        
        
    }
}
