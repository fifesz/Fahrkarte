public class Mehrfahrtenkarte extends Fahrkarte {
    private int anzahlFahrten;

    public Mehrfahrtenkarte (double preis, int anzahlFahrkarten){
        super (preis);
        this.anzahlFahrten = anzahlFahrten;
    }
    public String toString (){
        String s = super.toString ();
        s += " (" + anzahlFahrten + "Fahrten frei)";
        return s;
    }
}
