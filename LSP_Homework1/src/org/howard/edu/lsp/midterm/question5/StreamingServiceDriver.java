package org.howard.edu.lsp.midterm.question5;

public class StreamingServiceDriver {
    public static void main(String[] args) {
        // Create instances of different media types
        StreamingService music = new Music("Still a Friend - Incognito");
        StreamingService movie = new Movie("Avengers End Game");
        StreamingService audiobook = new AudioBooks("A Promised Land – Barack Obama");
        
        // Test the common behaviors for all media types (play, pause, stop)
        System.out.println("Testing common behaviors for all media types:\n");
        
        // Test Music
        System.out.println("Testing Music:");
        music.play();
        music.pause();
        music.stop();
        System.out.println();
        
        // Test Movie
        System.out.println("Testing Movie:");
        movie.play();
        movie.pause();
        movie.stop();
        System.out.println();
        
        // Test AudioBooks
        System.out.println("Testing AudioBooks:");
        audiobook.play();
        audiobook.pause();
        audiobook.stop();
        System.out.println();
        
        // Test unique behaviors for each media type
        // Test Movie-specific behavior (rewind)
        Movie movieWithRewind = (Movie) movie;  // Cast to Movie for specific method
        movieWithRewind.rewind(30);
        System.out.println();
        
        // Test Audiobook-specific behavior (setPlaybackSpeed)
        AudioBooks audiobookWithSpeed = (AudioBooks) audiobook;  // Cast to Audiobook for specific method
        audiobookWithSpeed.setPlaybackSpeed(1.5);
        System.out.println();
        
        // Test Music-specific behavior (addToPlaylist)
        Music musicWithPlaylist = (Music) music;  // Cast to Music for specific method
        musicWithPlaylist.addToPlaylist("Favorites");
    }
}