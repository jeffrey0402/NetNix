package Media;

import java.util.ArrayList;

public class Seizoen {
    public ArrayList<Aflevering> afleveringen;
    public String beschrijving;
    public Poster poster;

    public Seizoen(ArrayList<Aflevering> afleveringen, String beschrijving, Poster poster) {
        this.afleveringen = afleveringen;
        this.beschrijving = beschrijving;
        this.poster = poster;
    }
}
