package FactoryMethod;

import Media.*;

import java.util.ArrayList;

public class MediaFactory {

    public AbstractMedia createMedia(String type,String naam, Poster poster, ArrayList<Seizoen> seizoenen, String beschrijving,Ondertiteling ondertiteling, int duratie, Categorie categorie) {
        if ("Film".equalsIgnoreCase(type)) {
            return new Film(naam, poster, ondertiteling, duratie, beschrijving, categorie);
        } else if ("Serie".equalsIgnoreCase(type)) {
            return new Serie(naam, poster, seizoenen, beschrijving);
        } else {
            throw new IllegalArgumentException("Invalid media type");
        }
    }
}