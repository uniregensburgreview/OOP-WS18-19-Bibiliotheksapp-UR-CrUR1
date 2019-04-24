package library;

import java.time.Year;

/**
 * Created by Alexander Bazo on 16/11/15.
 */
public class Media {

    private static int mediaCount = 0;
    private int id;
    private int year;
    private String title;
    private Type type;

    public Media(int year, String title) {
        mediaCount++;
        this.id = mediaCount;
        this.year = year;
        this.title = title;
        this.type = Type.MISC;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return id+": " + title + " (" + year + ")";
    }
}
