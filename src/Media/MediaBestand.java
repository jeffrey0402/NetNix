package Media;

import java.sql.Array;
import java.util.ArrayList;

public interface MediaBestand {
    String naam = null;
    Poster poster = null;
    ArrayList<Ondertiteling> ondertiteling = new ArrayList<Ondertiteling>();
    int duratie = 0;
    Categorie categorie = null;
    String beschrijving = null;
}
