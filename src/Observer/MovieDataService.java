package Observer;

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

    public void notifyObservers() {
        for (MovieObserver observer : observers) {
            observer.onMovieFetched();
        }
    }

    public void fetchMovieData() {
        // Fetch movie data
        notifyObservers();
    }
}
