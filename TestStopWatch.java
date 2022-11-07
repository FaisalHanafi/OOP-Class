import java.util.Random;
public class TestStopWatch{
    public static void main(String[] args) {
        java.util.Random rd = new java.util.Random();
        
        int[] number = new int[100000];
        
        StopWatch sw1 = new StopWatch();
        
        for(int i = 0; i < number.length; i++) {
            number[i] = rd.nextInt(100000);
        }
         for (int k = 0; k < number.length; k++) { 
            int minimum = number[k]; 
            int minindex = k;

            for (int j = k + 1; j < number.length; j++) {
                if (minimum > number[j]) 
                {
                    minimum = number[j];
                    minindex = j;
                }
            }   

            if (minindex != k) {
                number[minindex] = number[k];
                number[k] = minimum;
            }
    
            sw1.stop();

            System.out.println("Sorting 100,000 numbers took " + sw1.getElapseTime() + " in milliseconds");
        }

 
}
}
 