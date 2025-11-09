public class Fahrkarte{
    private double preis;
    private boolean gueltig;

    public Fahrkarte (double preis){
        this.preis =preis;
       this.gueltig = true;
    }
    public double getPreis(){
        return preis;
    }
    public boolean istGueltig (){
        return gueltig;
    }
    protected void entwerten()
    {
        gueltig = false;
    }
    protected static double preisstufen[]
        = {1.8,2.9,3.8,4.8,5.6};
    public String toString(){
        return "Fahrpreis: " + preis + " Euro";
    }
    }
