
// Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
import java.util.ArrayList;

class MusicLibrary {
    private ArrayList<String> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void display() {
        System.out.println("song is : " + songs);
    }
}

class Main {
    public static void main(String[] args) {
        MusicLibrary ml = new MusicLibrary();
        ml.addSong("pretty little baby");
        ml.addSong("shine like moon");
        ml.display();
    }
}
