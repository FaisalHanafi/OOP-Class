public class StopWatch
{
    private long startTime;
    private long endTime;
    
    public StopWatch()
    {
        long startTime = System.currentTimeMillis();
    }
    public long getstartTime()
    {
        return startTime;
    }
    public long getendTime()
    {
        return endTime;
    }
    public void start()
    {
        startTime = System.currentTimeMillis();
    }
    public void stop()
    {
        endTime = System.currentTimeMillis();
    }
    public long getElapseTime()
    {
        return endTime-startTime;
    }
}
