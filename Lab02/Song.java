/**
* Lab02
*
* This is a simple object-oriented program that saves songs and their information and outputs it 
*
* @author Hayden MacIntyre
* @date September 9, 2019
**/
public class Song {
    // Song values 
    private String artist;
    private String title;
    private int duration;
    public String collectionName;

    // Constructor that saves the song's information to the object (artist's name, song title and duration)
    public Song(String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    // Returns the artist's name 
    public String getArtist() {
        return this.artist;
    }

    // Returns the song title 
    public String getTitle() {
        return this.title;
    }

    // Returns the duration of the song 
    public int getDuration() {
        return this.duration;
    }

    // Changes the artist's name 
    public void setArtist(String artistName) {
        this.artist = artistName;
    }

    // Changes the song title
    public void setTitle(String titleName) {
        this.title = titleName;
    }

    // Changes the duration of the song 
    public void setDuration(int time) {
        this.duration = time;
    }

    public static void main(String[] args) {
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
        Song one = new Song("Daft Punk", "One More Time", 322);

        sed.collectionName = "Randy's Collection";
        System.out.println("Collection: " + one.collectionName);
        printSong(sed);
        printSong(one);
    }

    public static void printSong(Song song) {
        int min = song.getDuration() / 60;
        int sec = song.getDuration() % 60;
        System.out.printf("%s (%s) - %d:%d\n",
        song.getTitle(), song.getArtist(), min, sec);
    }
}