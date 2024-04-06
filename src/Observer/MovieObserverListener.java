package Observer;

import Media.AbstractMedia;

public class MovieObserverListener implements MovieObserver {
    @Override
    public void onMovieFetched(AbstractMedia media) {
        System.out.println("Movie fetched");
    }
}
