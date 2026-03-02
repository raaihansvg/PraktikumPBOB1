public class Titik {
    private double absis;
    private double ordinat;
    static int countertitik;

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        countertitik ++;
    }

    Titik(){
        absis = 0;
        ordinat = 0;
        countertitik ++;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(countertitik);
    }

    public static int getCounterTitik(){
        return countertitik;
    }

    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
    }

    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    public void refleksiX() {
        setOrdinat(getOrdinat() * -1);
    }

    public void refleksiY() {
        setAbsis(getAbsis() * -1);
    }


    public Titik getRefleksiX() {
        Titik THasil = new Titik(getAbsis(), getOrdinat());
        THasil.refleksiX();
        return THasil;
    }

    public Titik getRefleksiY() {
        Titik THasil = new Titik(getAbsis(), getOrdinat());
        THasil.refleksiY();
        return THasil;
    }

    public void geser(double dx, double dy) {
        absis = absis + dx;
        ordinat = ordinat + dy;
    }
}
