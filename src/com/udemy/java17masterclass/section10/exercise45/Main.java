package java17masterclass.section10.exercise45;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("Greatest Hits", "Various Artists");

        album.addSong("Imagine", 3.03);
        album.addSong("Yesterday", 2.45);
        album.addSong("Let It Be", 4.01);

        LinkedList<Song> playList = new LinkedList<>();

        album.addToPlayList(1, playList);
        album.addToPlayList(3, playList);
        album.addToPlayList(5, playList);

        album.addToPlayList("Yesterday", playList);
        album.addToPlayList("Hey Jude", playList);

        System.out.println("Songs in the playlist:");
        for (Song song : playList) {
            System.out.println(song);
        }
    }
}
