public class Einzelfahrkarte extends Fahrkarte {
    public Einzelfahrkarte (double preis){
        super (preis);
    }
    public Einzelfahrkarte (int preisstufe) {
        super (preisstufen [preisstufe-1]);
    }
}
