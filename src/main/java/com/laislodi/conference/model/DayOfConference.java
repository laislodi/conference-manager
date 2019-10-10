package com.laislodi.conference.model;

import java.util.Objects;

public class DayOfConference {
    private final int MORNING_DURATION = 180;
    private final int AFTERNOON_MIN_DURATION = 180;
    private final int AFTERNOON_MAX_DURATION = 240;
    private Period morning;
    private Period afternoon;

    public DayOfConference() {
        morning = new Period(MORNING_DURATION);
        afternoon = new Period(AFTERNOON_MIN_DURATION, AFTERNOON_MAX_DURATION);
    }

    public DayOfConference(Period morning, Period afternoon) {
        this.morning = morning;
        this.afternoon = afternoon;
    }

    public Period getMorning() {
        return morning;
    }

    public void setMorning(Period morning) {
        this.morning = morning;
    }

    public Period getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Period afternoon) {
        this.afternoon = afternoon;
    }

    public int getDayDuration() {
        return this.MORNING_DURATION + this.AFTERNOON_MAX_DURATION;
    }

    @Override
    public String toString() {
        return "DayOfConference{" + "\n" +
                "morning=" + morning.toString() + "\n" +
                ", afternoon=" + afternoon.toString() + "\n" +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayOfConference that = (DayOfConference) o;
        return Objects.equals(morning, that.morning) &&
                Objects.equals(afternoon, that.afternoon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(morning, afternoon);
    }
}
