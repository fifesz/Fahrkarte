public class Einzelfahrkarte extends Fahrkarte {
    public Einzelfahrkarte (double preis){
        super (preis);
    }
    public Einzelfahrkarte (int preisstufe) {
        super (preisstufen [preisstufe-1]);
    }
    public String toString (){
        String s = super.toString ();
        if (!istGueltig ()) s += " (entwertet=";
        return s;
    }
    public boolean nutzen (){
        if (istGueltig ()){
            entwerten ();
            return true;
        }
        else return false;
    }
}
