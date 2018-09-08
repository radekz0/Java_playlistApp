package playlist;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    private static PlayPlaylist play;

    public static void main(String[] args) {
        Album album = new Album("Back in Black","AC/DC");
        album.addSong("Hells Bells",5.12);
        album.addSong("Shoot to Thrill", 5.17);
        album.addSong("What Do You Do for Money Honey", 3.35);
        album.addSong("Given the Dog a Bone",3.31);
        albums.add(album);

        Album album2 = new Album("Eliminator", "ZZ Top");
        album2.addSong("Gimme All Your Lovin", 3.59);
        album2.addSong("Sharp Dressed Man",4.14);
        album2.addSong("Dirty Dog",4.05);
        album2.addSong("I Got the Six", 2.52);
        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("Hells Bells", playlist);
        albums.get(0).addToPlaylist("Shoot to Thrill", playlist);
        albums.get(1).addToPlaylist("I Got the Six", playlist);
        albums.get(1).addToPlaylist("Dirty Dog", playlist);

        play = new PlayPlaylist(playlist);
    }

}
