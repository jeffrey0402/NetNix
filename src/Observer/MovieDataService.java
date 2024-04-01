package Observer;

import java.util.ArrayList;

public class MovieDataService {
    private ArrayList<MovieObserver> observers;

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
