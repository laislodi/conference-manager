package com.laislodi.conference.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Period {
    private List<Track> tracks;
    private int maxDuration;
    private int minDuration;
    private int duration;

    public Period() {
        tracks = new ArrayList<>();
    }

    public Period(int maxDuration) {
        this.maxDuration = maxDuration;
        this.minDuration = maxDuration;
    }

    public Period(int minDuration, int maxDuration) {
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
    }

    public Period(List<Track> tracks, int minDuration, int maxDuration, int duration) {
        this.tracks = tracks;
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
        this.duration = duration;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringBuilder stracksToString = new StringBuilder();
        for (Track track : this.tracks) {
            stracksToString.append(track.toString());
            stracksToString.append("\n");
        }
        return "Period{" + "\n" +
                "  tracks=" + stracksToString.toString() +
                ", minDuration=" + minDuration + "\n" +
                ", maxDuration=" + maxDuration + "\n" +
                ", duration=" + duration + "\n" +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Period period = (Period) o;
        return minDuration == period.minDuration &&
                maxDuration == period.maxDuration &&
                duration == period.duration &&
                Objects.equals(tracks, period.tracks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracks, minDuration, maxDuration, duration);
    }
}
