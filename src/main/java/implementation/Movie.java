package implementation;

public class Movie extends StandardMultimedia {
    protected String director;

    public Movie(String title, String author, String director) {
        super(title, author);
        this.director = director;
    }

    public void play(){
        super.play();
        System.out.println("Reżyser = " + this.director);
    }


}
