package Media;

import java.util.HashMap;

public class StommeOndertiteling {

    public String taal;
    public String bestandsType;
    public HashMap<String, Integer> ondertitelRegels;

    public StommeOndertiteling(String taal, String bestandsType, HashMap<String, Integer> ondertitelRegels) {
        this.taal = taal;
        this.bestandsType = bestandsType;
        this.ondertitelRegels = ondertitelRegels;
    }
}
