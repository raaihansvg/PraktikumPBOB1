public class titik {

    private double absis;
    private double ordinat;

    
    titik() {
        absis = 0;
        ordinat = 0;
    }


    double getAbsis(){
        return absis;
    }


    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        this.absis = x;
    }


    void setOrdinat(double y){
        this.ordinat = y;
    }


    void geser(double x, double y){
        this.absis = absis +x;
        this.ordinat = ordinat + y;
    }

    int Kuadran(){
        if (this.absis > 0 && this.ordinat > 0){
            return 1;
        }else{
            if (this.absis < 0 && this.ordinat > 0){
                return 2;
            }else{
                if (this.absis < 0 && this.ordinat < 0){
                    return 3;
                }else{
                    if (this.absis > 0 && this.ordinat < 0){
                        return 4;
                    }else{
                        return 0;
                    }
                }
            }
        }
    }

    double JarakkePusat(){
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }



    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}