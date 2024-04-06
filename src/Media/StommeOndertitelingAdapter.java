package Media;

import java.util.HashMap;

public class StommeOndertitelingAdapter {
    private StommeOndertiteling stommeOndertiteling;
    public StommeOndertitelingAdapter(StommeOndertiteling stommeOndertiteling) {
        this.stommeOndertiteling = stommeOndertiteling;
    }

    public Ondertiteling getOndertiteling() {
        HashMap<Integer, String> ondertitelRegels = new HashMap<Integer, String>();

        // Draai de waarden en sleutels om
        for (String ondertitelRegel : stommeOndertiteling.ondertitelRegels.keySet()) {
            ondertitelRegels.put(stommeOndertiteling.ondertitelRegels.get(ondertitelRegel), ondertitelRegel);
        }

        return new Ondertiteling(stommeOndertiteling.taal, stommeOndertiteling.bestandsType, ondertitelRegels);
    }
}