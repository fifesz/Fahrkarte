public class Mehrfahrtenkarte extends Fahrkarte implements Rueckfahrt {
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
    public boolean nutzen ()
    {
        if (istGueltig())
        {
            entwerten();
            return true;
        }
        else return false;
    }
    public boolean nutzen (boolean mitRueckfahrt){
        if (!mitRueckfahrt) return nutzen();
        else if (anzahlFahrten >= 2){
            nutzen();
            nutzen();
            return true;
        }
        else return false;
    }
}
