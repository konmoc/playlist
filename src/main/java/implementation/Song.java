package implementation;

public class Song extends StandardMultimedia {
    protected String musicBand;

    public Song(String title, String author, String musicBand) {
        super(title, author);
        this.musicBand = musicBand;
    }

    public void play() {
        super.play();
        System.out.println("Wykonawca = " + this.musicBand);
    }
}
