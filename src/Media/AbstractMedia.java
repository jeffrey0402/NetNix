package Media;

public abstract class AbstractMedia {
    protected String naam;
    protected Poster poster;
    protected Ondertiteling ondertiteling;
    protected int duratie;
    protected String beschrijving;
    protected Categorie categorie;

    public AbstractMedia(String naam, Poster poster, Ondertiteling ondertiteling, int duratie, String beschrijving, Categorie categorie) {
        this.naam = naam;
        this.poster = poster;
        this.ondertiteling = ondertiteling;
        this.duratie = duratie;
        this.beschrijving = beschrijving;
        this.categorie = categorie;
    }
    public abstract void Play();

    public String getNaam() {
        return naam;
    }
}