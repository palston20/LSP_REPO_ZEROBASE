package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;


public class VotingMachine {

	//Decided to use a map to store candidate names and votes 
		private Map<String, Integer> candidates;
		
		//Constructor to intialize the voting machine
		public VotingMachine() {
			candidates = new HashMap<>();
	}
	/**
	 * Will add candidates to the voting machine
	 * 
	 * @param candidate <-- the name of the candidate that will be added
	 */
	public void addCandidate(String candidate) {
		candidates.put(candidate, 0);
	}
	/**
     * Casts a vote for a candidate if the candidate exists.
     * 
     * @param candidate The name of the candidate to vote for.
     * @return true if the vote was successfully cast, false otherwise.
     */
    public boolean castVote(String candidate) {
        if (candidates.containsKey(candidate)) {
            // Increment the vote count for the candidate
            candidates.put(candidate, candidates.get(candidate) + 1);
            return true;
        } else {
            // If the candidate doesn't exist, return false
            return false;
        }
    }

    /**
     * Gets winner of the election (person with the most votes).
     * 
     * @return <-- indicates the winner and their number of votes.
     */
    
    public String getWinner() {
        String winner = "";
        int maxVotes = -1;

        // Check which candidate has the most votes
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > maxVotes) {
                winner = entry.getKey();
                maxVotes = entry.getValue();
            }
        }

        // Returns  winner with vote count
        return winner + " WINS with " + maxVotes + " votes!!";
    }

}
