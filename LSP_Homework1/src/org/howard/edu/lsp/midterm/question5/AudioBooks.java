package org.howard.edu.lsp.midterm.question5;

public class AudioBooks implements StreamingService {
    private String title;

    // Constructor
    public AudioBooks(String title) {
        this.title = title;
    }

    //Override
    public void play() {
        System.out.println("Playing audiobook: " + title);
    }

    //Override
    public void pause() {
        System.out.println("Paused audiobook: " + title);
    }

    //Override
    public void stop() {
        System.out.println("Stopped audiobook: " + title);
    }

    // Audiobook feature: Set playback speed
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + title + " " + speed + "x");
    }
}