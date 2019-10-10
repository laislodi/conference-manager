package com.laislodi.conference.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Conference {

    private List<DayOfConference> daysOfConference;

    public Conference() {
        daysOfConference = new ArrayList<>();
    }

    public Conference(int days) {
        daysOfConference = new ArrayList<>(days);
    }

    public Conference(List<DayOfConference> daysOfConference) {
        this.daysOfConference = daysOfConference;
    }

    public List<DayOfConference> getDaysOfConference() {
        return daysOfConference;
    }

    public void setDaysOfConference(List<DayOfConference> daysOfConference) {
        this.daysOfConference = daysOfConference;
    }

    @Override
    public String toString() {
        return "Conference{" + "\n" +
                "daysOfConference=" + daysOfConference + "\n" +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conference that = (Conference) o;
        return Objects.equals(daysOfConference, that.daysOfConference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daysOfConference);
    }
}
