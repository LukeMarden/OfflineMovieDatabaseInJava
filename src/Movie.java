import com.sun.tools.internal.xjc.reader.gbind.ElementSets;

import java.util.ArrayList;
import java.util.Comparator;


public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private String rating;
    private String genre;
    private int duration;
    public ArrayList<Movie> movieRecords = new ArrayList<Movie>();



    public int compareTo(Movie y) {
        int compareYear=((Movie)y).getYear();
        return this.year-compareYear;
//        https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/

    }

    public static Comparator<Movie> sortDuration = new Comparator<Movie>() {
        public int compare(Movie p1, Movie p2) {
            int duration1 = p1.getDuration();
            int duration2 = p2.getDuration();
            return duration1-duration2;
        }

    };
//    public static Comparator<Movie> sortReverseChronilogical = new Comparator<Movie>() {
//        public int compare(Movie y) {
//            int compareYear=((Movie)y).getYear();
//            return this.getYear()-compareYear;
//
//        }
//
//    };




//    public static Comparator<Movie> sortGenre = new Comparator<Movie>() {
//        public int compare(Movie p1, Movie p2) {
//
//            String genre1 = p1.getGenre();
//            String genre2 = p2.getGenre();
//
//        }
//
//    };



    public Movie (String name, int year, String rating, String genre, int duration) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.duration = duration;

    }


    public void setName(String n) {
        name = n;
    }

    public void setYear(int y) {
        year = y;
    }

    public void setRating(String r) {
        rating = r;
    }

    public void setGenre(String g) {
        genre = g;
    }

    public void setDuration(int d) { duration = d; }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() { return duration; }


    public String toString() {
        return (name + " " + year + " " + rating + " " + genre + " " + duration);
    }


}

