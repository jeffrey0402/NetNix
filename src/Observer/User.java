package Observer;

import Media.AbstractMedia;

public class User implements MovieObserver {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void onMovieFetched(AbstractMedia media) {
        System.out.println("Fetching Movie: " + media.getNaam() + " for user: " + name);
    }
}