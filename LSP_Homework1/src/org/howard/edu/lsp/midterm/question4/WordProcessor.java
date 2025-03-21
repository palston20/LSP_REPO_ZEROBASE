package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
	private String sentence; //Stores sentence to be processed 
	
	//Constructor
	public WordProcessor(String sentence) {
		this.sentence = sentence;

	}
	
	/**
	 * This method will find and return the longest words in the sentence
	 * It will split the sentence into words and find the longest word
	 * @return will return a list of the longest words in the sentence
	 */
	
	//Method to find all longest words in sentence 
	public List<String> findLongestWords(){
		//Splits sentence into words 
		String[] words = sentence.trim().split("\\s+");
		
		//List to store long words 
		List<String> longestWords = new ArrayList<>();
		
		if (words.length == 0) {
            return longestWords; //Returns empty list if no words are found
		}
            
        // Find the length of the longest word
        int maxLength = 0;
        for (String word : words) {
           if (word.length() > maxLength) {
              maxLength = word.length();
	}
        }

        // Add all words that have the maximum length
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word); // Add the word to the list if it's the longest
            }
        }

        return longestWords; // Return the list of longest words
    }
	}


