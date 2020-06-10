
import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.file.Path;


public class MovieDatabase
{
    private ArrayList<Movie> movieRecords = new ArrayList<Movie>();
    private Path filePath;
    private String Q1;
    private String Q2;
    private String Q3;

    public MovieDatabase() {
        filePath = new File("films.txt").toPath();
        movieRecords = this.readFile();
        Q1 = sortChronilogically();
        Q2 = sortGenreAndChronilogically();
        Q3 = sortRatingAndChronologically();




    }
    public String Q1() {
        return Q1;
    }
    public String Q2() {
        return Q2;
    }
    public String Q3() {
        return Q3;
    }



    public ArrayList readFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("films.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                String[] studentDetail = currentLine.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                //https://stackabuse.com/regex-splitting-by-character-unless-in-quotes/
                //https://stackoverflow.com/questions/1757065/java-splitting-a-comma-separated-string-but-ignoring-commas-in-quotes

                String name = studentDetail[0];
                int year = Integer.valueOf(studentDetail[1]);
                String rating = studentDetail[2];
                String genre = studentDetail[3];
                int duration = Integer.valueOf(studentDetail[4]);

                movieRecords.add(new Movie(name, year, rating, genre, duration));
//            System.out.println(name + year + rating + genre + duration);

                currentLine = reader.readLine();
            }
        }
        catch(IOException ie) {
        ie.printStackTrace();

        }
        return movieRecords;

}


    public String sortChronilogically()  {
        Collections.sort(movieRecords);

        for (Movie movie : movieRecords) {
//
//            System.out.println(movie.toString());
            return movie.toString();

            //https://stackoverflow.com/questions/3123086/access-object-variable-in-an-array-of-objects




        }
        return null;

    }


    public String sortGenreAndChronilogically() {
        List<Movie> genre = new ArrayList<>();
        for (Movie movie : movieRecords) {
            String Genre = movie.getGenre();

            if (Genre.contains("Film-Noir")) {
                genre.add(movie);





            }
            //https://stackoverflow.com/questions/3123086/access-object-variable-in-an-array-of-objects
        }
        Collections.sort(genre, Movie.sortDuration);
        int i = 2;
        System.out.println(genre.get(i));
        String Answer = genre.get(i).toString();
        return Answer;
    }


    public String sortRatingAndChronologically() {
        List<Movie> rating = new ArrayList<>();
        for (Movie movie : movieRecords) {
            String Rating = movie.getRating();

            if (Rating.contains("UNRATED")) {
                rating.add(movie);

            }

            //https://stackoverflow.com/questions/3123086/access-object-variable-in-an-array-of-objects
        }
        Collections.sort(rating);
        for (Movie movie : rating) {
            return movie.toString();



        }
        return null;


    }





}