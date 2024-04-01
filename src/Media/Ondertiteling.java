package Media;

import java.util.HashMap;

public class Ondertiteling {
    public String taal;
    public String bestandsType;
    public HashMap<Integer, String> ondertitelRegels;

    public Ondertiteling(String taal, String bestandsType, HashMap<Integer, String> ondertitelRegels) {
        this.taal = taal;
        this.bestandsType = bestandsType;
        this.ondertitelRegels = ondertitelRegels;
    }
}
