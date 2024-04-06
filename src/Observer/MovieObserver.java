package Observer;

import Media.AbstractMedia;

public interface MovieObserver {
    void onMovieFetched(AbstractMedia media);
}