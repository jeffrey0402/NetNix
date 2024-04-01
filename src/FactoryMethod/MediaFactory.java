package FactoryMethod;

import Media.*;

import java.util.ArrayList;

public class MediaFactory {
    public static Film createFilm(String naam, Poster poster, Ondertiteling ondertiteling, int duratie, String beschrijving, Categorie categorie) {
        return new Film(naam, poster, ondertiteling, duratie, beschrijving, categorie);
    }

    public static Serie createSerie(String naam, Poster poster, ArrayList<Seizoen> seizoenen, String beschrijving) {
        return new Serie(naam, poster, seizoenen, beschrijving);
    }
}