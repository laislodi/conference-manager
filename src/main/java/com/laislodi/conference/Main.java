package com.laislodi.conference;

import com.laislodi.conference.model.Conference;
import com.laislodi.conference.model.DayOfConference;
import com.laislodi.conference.model.Period;
import com.laislodi.conference.model.Track;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Track> tracks = loadTracks();
        Map<Integer, Integer> tracksPerDuration = tracksPerDuration(tracks);
        Collections.sort(tracks);
        int totalDuration = 0;

        for (Track track : tracks) {
            System.out.println(track);
            totalDuration += track.getDuration();
        }

        System.out.println("Total: " + totalDuration + "min");
        int totalHours = totalDuration/60;
        System.out.println("Total in hours: " + totalHours + "h" + totalDuration%60 + "min");

        Conference conference = scheduleConference(tracks, totalDuration);

    }

    private static Map<Integer, Integer> tracksPerDuration(List<Track> tracks) {
        Map<Integer, Integer> tracksPerDuration = new HashMap<>();
        for (Track track : tracks) {
            if (!tracksPerDuration.containsKey(track.getDuration())) {
                tracksPerDuration.put(track.getDuration(), 1);
            } else {
                Integer numberOfTracks = tracksPerDuration.get(track.getDuration());
                tracksPerDuration.put(track.getDuration(), numberOfTracks+1);
            }
        }
        return tracksPerDuration;
    }

    private static Conference scheduleConference(List<Track> tracks, int timeOfConference) {

        int durationPerDay = 420;
        int extraDay = 0;
        if (timeOfConference % durationPerDay != 0) {
            extraDay = 1;
        }
        int days = timeOfConference/durationPerDay + extraDay;
        Conference conference = new Conference(days);

        for (int i = 0; i < days; i++) {
            Period morning = new Period(180);


        }




        return conference;
    }

    private static List<Track> loadTracks() {
        List<Track> list = new ArrayList<>();

        list.add(new Track("Writing Fast Tests Against Enterprise Rails", 60));
        list.add(new Track("Overdoing it in Python", 45));
        list.add(new Track("Lua for the Masses", 30));
        list.add(new Track("Ruby Errors from Mismatched Gem Versions", 45));
        list.add(new Track("Common Ruby Errors", 45));
        list.add(new Track("Rails for Python Developers", 5));
        list.add(new Track("Communicating Over Distance", 60));
        list.add(new Track("Accounting-Driven Development", 45));
        list.add(new Track("Woah", 30));
        list.add(new Track("Sit Down and Write", 30));
        list.add(new Track("Pair Programming vs Noise", 45));
        list.add(new Track("Rails Magic", 60));
        list.add(new Track("Ruby on Rails: Why We Should Move On", 60));
        list.add(new Track("Clojure Ate Scala (on my project)", 45));
        list.add(new Track("Programming in the Boondocks of Seattle", 30));
        list.add(new Track("Ruby vs. Clojure for Back-End Development", 30));
        list.add(new Track("Ruby on Rails Legacy App Maintenance", 60));
        list.add(new Track("A World Without HackerNews", 30));
        list.add(new Track("User Interface CSS in Rails Apps", 30));

        return list;
    }
}
