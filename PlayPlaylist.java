package playlist;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class PlayPlaylist {
    private Scanner scanner;
    private ListIterator<Song> listiterator;
    private ListIterator<Song> listiterator1;
    private boolean quit;
    private LinkedList<Song> playlist;

    public PlayPlaylist(LinkedList<Song> playlist){
        this.playlist = playlist;
        play(playlist);
    }

    //The play method accepts LinkedList of songs and creates app menu.
    private void play(LinkedList<Song> playlist){
        scanner = new Scanner(System.in);
        listiterator = playlist.listIterator();
        listiterator1 = playlist.listIterator();
        quit = false;
        printMenu();

        while(!quit)
        {
            int input = scanner.nextInt();
            switch (input)
            {
                case 1:
                    if(listiterator.hasNext()){     //if LinkedList has next element to point
                        System.out.println("Now playing: " + listiterator.next());      //go to the next element in LinkedList
                        break;
                    }else {
                        System.out.println("No more songs in the playlist.");
                        break;
                    }
                case 2:
                    if(listiterator.hasPrevious()){
                        System.out.println("Now playing: " + listiterator.previous());
                        break;
                    }else {
                        System.out.println("No more songs in the playlist.");
                        break;
                    }
                case 3:
                    showPlaylist();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }

    }

    private void printMenu(){
        System.out.println("\nEnter 1 for next track on your playlist.");
        System.out.println("Enter 2 for previous track on your playlist.");
        System.out.println("Enter 3 to see your playlist.");
        System.out.println("Enter 4 to quit your playlist.\n");
    }

    private void showPlaylist(){
        listiterator1 = playlist.listIterator();
        while(listiterator1.hasNext())
        {
            System.out.println(listiterator1.next().toString());
        }
    }

}
