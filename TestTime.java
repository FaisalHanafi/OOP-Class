public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time(555550000);
        Time time2 = new Time();
        System.out.println("The 1st object's hour is "+time1.gethour()+" its minute is "+ time1.getminute() + "and its second is "+time1.getsecond());
    
        System.out.println("The 2nd object's hour is "+time2.gethour()+" its minute is "+ time2.getminute() + "and its second is "+time2.getsecond());
           
        time2.setTime(24741545);
        System.out.println("The new 2nd object's hour is "+time2.gethour()+" its minute is "+ time2.getminute() + "and its second is "+time2.getsecond());
    }
}