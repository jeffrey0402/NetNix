package Media;

import java.util.HashMap;

public class StommeOndertitelingAdapter {
    private StommeOndertiteling stommeOndertiteling;
    public StommeOndertitelingAdapter(StommeOndertiteling stommeOndertiteling) {
        this.stommeOndertiteling = stommeOndertiteling;
    }

    public Ondertiteling getOndertiteling() {
        HashMap<Integer, String> ondertitelRegels = new HashMap<Integer, String>();
        for (String key : stommeOndertiteling.ondertitelRegels.keySet()) {
            ondertitelRegels.put(Integer.parseInt(key), String.valueOf(stommeOndertiteling.ondertitelRegels.get(key)));
        }
        return new Ondertiteling(stommeOndertiteling.taal, stommeOndertiteling.bestandsType, ondertitelRegels);
    }
}
