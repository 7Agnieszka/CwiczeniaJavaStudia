package projekt;

import java.time.LocalDate;
import java.time.LocalTime;

public class StopWatch {

    private int startTime;
    private int endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startTime = LocalTime.now().getNano();
    }

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void start()
    {
        startTime = LocalTime.now().getNano();
    }

    public void stop()
    {
        endTime = LocalTime.now().getNano();
    }

    public int getElapsedTime(){

        return (endTime - startTime);

    }
}
