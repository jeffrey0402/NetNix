package Observer;

public class MovieObserverListener implements MovieObserver {
    @Override
    public void onMovieFetched() {
        System.out.println("Movie fetched");
    }
}
