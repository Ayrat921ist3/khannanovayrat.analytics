package ru.khannanovayrat.analytics.POJO;

/**
 * Created by ayrat on 11.05.16.
 */
public class Session {

    private int count;
    private long sessionAvg;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getSessionAvg() {
        return sessionAvg;
    }

    public void setSessionAvg(long sessionAvg) {
        this.sessionAvg = sessionAvg;
    }
}
