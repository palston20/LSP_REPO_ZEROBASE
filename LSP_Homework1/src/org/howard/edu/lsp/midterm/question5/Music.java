package org.howard.edu.lsp.midterm.question5;

//Concrete Class for the Music
public class Music implements StreamingService {
	private String title; 
	
	//Constructor
	public Music(String title) {
		this.title = title;
	}

	//Override 
	public void play() {
		System.out.println("Playing music: "+ title);
}
	//Override
    public void pause() {
        System.out.println("Paused music: " + title);
    }

    //Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }

    // Music feature: Add to playlist
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }
}
