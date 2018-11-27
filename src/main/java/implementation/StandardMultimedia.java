package implementation;

import api.Multimedia;

public class StandardMultimedia implements Multimedia {
    protected String title;
    protected String author;

    public StandardMultimedia(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void play() {
        System.out.println(this.title + " " + this.author);
    }


}
