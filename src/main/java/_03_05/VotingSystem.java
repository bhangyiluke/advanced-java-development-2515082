package _03_05;

import java.util.LinkedHashMap;

public class VotingSystem {

    // Create a LinkedHashMap here, with the contestant name as the key
    // and the number of votes as the value.
    LinkedHashMap<String,Integer> votes= new LinkedHashMap<>();

    void vote(String contestant) {
        votes.merge(contestant, 1, Integer::sum);
        // Implement this method so that a new contestant is added to the map if it's
        // not already there. If it is already there, increment the value by one.
    }

    // This method should return the LinkedHashMap field you create at the top of
    // the class.
    public LinkedHashMap<String,Integer> getVotes() {
        return votes;
    }


}
