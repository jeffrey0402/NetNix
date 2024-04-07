import Command.Player;
import FactoryMethod.MediaFactory;
import Media.*;
import Observer.MovieDataService;
import Observer.User;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welkom bij NetNix");

        // Command pattern demo
        Player player = new Player();

        // Buttons worden normaal gesproken uitgevoerd door de GUI
        player.play();
        player.pause();

        // Adapter pattern demo
        HashMap<String, Integer> ondertitelRegels = new HashMap<>();
        ondertitelRegels.put("Deze regel tekst komt voor in de eerste seconde.", 1);
        ondertitelRegels.put("Ik heb niks gedaan! Wat gebeurt er???", 24);
        ondertitelRegels.put("Inspirationele tekst hier", 15);
        StommeOndertiteling stommeOndertiteling = new StommeOndertiteling("Nederlands", "srt", ondertitelRegels);
        // Werkt niet!! Stomme ondertiteling werkt niet met Film.
//        Film film = new Film("The Shawshank Redemption", null, stommeOndertiteling, 142, "Two imprisoned", Categorie.ACTIE);
        StommeOndertitelingAdapter adapter = new StommeOndertitelingAdapter(stommeOndertiteling);
        // Werkt wel! Adapter zorgt ervoor dat stomme ondertiteling werkt met Film.
        Film film = new Film("The Shawshank Redemption", null, adapter.getOndertiteling(), 142, "Two imprisoned", Categorie.ACTIE);

        // Factory method
        MediaFactory mediaFactory = new MediaFactory();
        // create serie
        AbstractMedia serieBreakingBad = mediaFactory.createMedia( "Serie", "Breaking Bad", new Poster("Breaking Bad poster", "breakingbad.jpg", "2008-01-20"),
                new ArrayList<>(), "A high school chemistry teacher turned meth producer", null, 50, Categorie.DRAMA);
        // create film
        AbstractMedia filmTerminator = mediaFactory.createMedia("Film", "Terminator", new Poster("Terminator poster", "terminator.jpg", "1984-01-10"),
                new ArrayList<>(), "A cyborg assassin sent back in time to kill Sarah Connor", adapter.getOndertiteling(), 120, Categorie.SCIENCEFICTION);

        // MovieObserver pattern demo
        User account1 = new User("John Doe");
        MovieDataService movieDataService = new MovieDataService();
        movieDataService.addObserver(account1);
        movieDataService.fetchMovieData(filmTerminator);
    }
}