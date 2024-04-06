package Observer;

import Media.AbstractMedia;

import java.util.ArrayList;
import java.util.List;

public class MovieDataService {
    private final List<MovieObserver> observers = new ArrayList<>();

    public void addObserver(MovieObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MovieObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(AbstractMedia media) {
        for (MovieObserver observer : observers) {
            observer.onMovieFetched(media);
        }
    }

    public void fetchMovieData(AbstractMedia media) {
        // Fetch movie data
        notifyObservers(media);
    }
}