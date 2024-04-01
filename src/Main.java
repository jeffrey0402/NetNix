import Command.PauseCommand;
import Command.PlayCommand;
import Command.Player;
import Media.Categorie;
import Media.Film;
import Media.StommeOndertiteling;
import Media.StommeOndertitelingAdapter;

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
    }
}