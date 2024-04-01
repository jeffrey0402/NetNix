package Media;

import java.util.ArrayList;

public class Serie {
    public String naam;
    public Poster poster;
    public ArrayList<Seizoen> seizoenen;
    public String beschrijving;

    public Serie(String naam, Poster poster, ArrayList<Seizoen> seizoenen, String beschrijving) {
        this.naam = naam;
        this.poster = poster;
        this.seizoenen = seizoenen;
        this.beschrijving = beschrijving;
    }
}
