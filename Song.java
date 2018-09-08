package playlist;


public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public double getDuration(){
        return duration;
    }

    //Overriding toString method is necessary to see what is inside a certain Song object.
    @Override
    public String toString() {
        return title + " duration: " + duration;
    }
}
