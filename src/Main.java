public class Main{
    public static void main (String[] args){
        GueltigeFahrkarten g = new GueltigeFahrkarten() {
            @Override
            public Fahrkarte[] pruefen(Fahrkarte[] feld) {
                int n = 0;
                for (Fahrkarte k : feld)
                    if (k.istGueltig()) n++;
                Fahrkarte [] gueltige = new Fahrkarte[n];
                n = 0;
                for (Fahrkarte k : feld)
                    if (k.istGueltig()) gueltige[n++] = k;
                return gueltige;
            }
        };
    }
}