package Media;

import java.util.ArrayList;

public class Serie extends AbstractMedia{
    public String naam;
    public Poster poster;
    public ArrayList<Seizoen> seizoenen;
    public String beschrijving;

    public Serie(String naam, Poster poster, ArrayList<Seizoen> seizoenen, String beschrijving) {
        super(naam, poster, null, 0, beschrijving, null);
        this.naam = naam;
        this.poster = poster;
        this.seizoenen = seizoenen;
        this.beschrijving = beschrijving;
    }

    @Override
    public void Play() {
        System.out.println("Playing: " + naam);
    }
}