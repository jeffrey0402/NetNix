import Command.Player;
import FactoryMethod.MediaFactory;
import Media.*;

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
        // Serie object
        Serie serieBreakingBad = MediaFactory.createSerie("Breaking Bad", new Poster("Breaking Bad poster", "breakingBad.jpg", "2011-04-01"),
                new ArrayList<>(), "Teacher goes insane");
        // Film object
        Film filmTerminator = MediaFactory.createFilm("Terminator", new Poster("Terminator poster", "terminator.jpg", "1991-04-01"),
                new Ondertiteling("Engels", "SRT", new HashMap<>()), 120, "Cyborg from the future", Categorie.SCIENCEFICTION);
    }
}