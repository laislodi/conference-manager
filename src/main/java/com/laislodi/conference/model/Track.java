package com.laislodi.conference.model;

import java.util.Comparator;
import java.util.Objects;

public class Track implements Comparable<Track> {
    private String title;
    private int duration;

    public Track() {
    }

    public Track(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + " - " + duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return duration == track.duration &&
                Objects.equals(title, track.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }

    @Override
    public int compareTo(Track o) {
        return o.getDuration() - this.getDuration();
    }
}
