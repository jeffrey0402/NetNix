package Media;

import java.util.ArrayList;

public class Aflevering {
    public String naam;
    public Poster poster;
    public ArrayList<Ondertiteling> ondertitelingen;
    public int duratie;
    public Categorie categorie;
    public String beschrijving;

    public Aflevering(String naam, Poster poster, ArrayList<Ondertiteling> ondertitelingen, int duratie, Categorie categorie, String beschrijving) {
        this.naam = naam;
        this.poster = poster;
        this.ondertitelingen = ondertitelingen;
        this.duratie = duratie;
        this.categorie = categorie;
        this.beschrijving = beschrijving;
    }

    public void Play() {
        System.out.println("Playing " + naam);
    }

}
