package Media;

public class Film extends AbstractMedia {
    public String naam;
    public Poster poster;
    public Ondertiteling ondertiteling;
    public int duratie;
    public String beschrijving;
    public Categorie categorie;

    public Film(String naam, Poster poster, Ondertiteling ondertiteling, int duratie, String beschrijving, Categorie categorie) {
        super(naam, poster, ondertiteling, duratie, beschrijving, categorie);
        this.naam = naam;
        this.poster = poster;
        this.ondertiteling = ondertiteling;
        this.duratie = duratie;
        this.beschrijving = beschrijving;
        this.categorie = categorie;
    }

    public void Play() {
        System.out.println("Playing: " + naam);
    }

}