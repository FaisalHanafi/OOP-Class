public class Time{
    private int hour;
    private int minute;
    private int second;
    private long times;

    public Time() {
        times = System.currentTimeMillis();
    }

    public Time(long times) {
        this.times = times;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapseTime) {
        times = elapseTime;
    }


    public int gethour() {
        return (int)((times / (1000 * 60 * 60)) % 24);
    }

    public int getminute() {
        return (int)((times / (1000 * 60)) % 60);
    }

    public int getsecond() {
        return (int)((times / 1000) % 60);
    }

}