package test;

import java.util.*;
import java.text.SimpleDateFormat;


public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {
        for (int i = 0; i < movies.size(); i++) {
            Movie m1 = (Movie) ((ArrayList) movies).get(i);
            for (int j = i + 1; j < movies.size(); j++) {
                Movie m2 = (Movie) ((ArrayList) movies).get(j);
                {
                    if (isOverLap(m1, m2)) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static Boolean isOverLap(Movie m1, Movie m2) {
        long t1 = m1.getStart().getTime();
        long t2 = m1.getEnd().getTime();
        long h1 = m2.getStart().getTime();
        long h2 = m2.getEnd().getTime();
        if (t1 > h1 && h1 < t2) {
            return true;
        }
        System.out.println("still");
        if (t1 > h2 && h2 < t2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;

    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }

    @Override
    public String toString() {
        return "Movie [start=" + start + ", end=" + end + "]";
    }

}
