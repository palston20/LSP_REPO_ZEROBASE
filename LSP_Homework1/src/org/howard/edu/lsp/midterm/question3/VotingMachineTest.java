package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachineTest {
	public static void main(String[] args) {
        // Creates a new VotingMachine instance
		VotingMachine vm = new VotingMachine();
		
		//Adding the candidates 
		vm.addCandidate("Alice");
		vm.addCandidate("Bob");
		vm.addCandidate("Charlie");
		
		//Casts votes for candidates
		vm.castVote("Alice");
		vm.castVote("Alice");
		vm.castVote("Bob");
		vm.castVote("Charlie");
		vm.castVote("Charlie");
		vm.castVote("Charlie");
		
		//In case of an attempt to vote for non-existent candidate
		boolean success = vm.castVote("Eve");
		System.out.println("Vote for Even successful? " + success);
		
		//Displays winner 
		System.out.println("Winner:" +vm.getWinner());
	
	
	}

}
