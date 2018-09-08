package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artistName;
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName, String artistName){
        this.albumName = albumName;
        this.artistName = artistName;
        songs = new ArrayList<>();
    }

    public void addSong(String title, double duration){
        Song foundSong = findSong(title);      //findSong method is used to determine if you don't add a duplicate to your album.
        if(foundSong == null) {
            this.songs.add(new Song(title,duration));   //If the song is not in the album it created a Song object.
            System.out.println("Song: " + title + " added to the album: " + albumName);
        }
        else{
            System.out.println("Song: " + title + " is already in the album: " + albumName);
        }
    }

    //This method allows to create ad playlist of available songs in albums.
    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song foundSong = findSong(title);
        if(foundSong != null){
            playlist.add(foundSong);
            return true;
        }
        System.out.println("Failed to add: " + title + ".");
        return false;
    }

    //This method returns a Song object of inserted title.
    private Song findSong(String title){
        for(Song checkSong: songs){
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

}