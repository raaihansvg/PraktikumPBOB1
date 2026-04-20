class box<T>{
    private T isi;

    public void setIsi(T isi){
        this.isi = isi;
    }

    public T getIsi(){
        return isi;
    }
}

public class CollectionandGeneric1{
    public static void main(String[] args){
        box<String> Kotak = new box<>();
        Kotak.setIsi("Kontol");
        System.out.println(Kotak.getIsi());
        /* ================================ */
        box<Integer> KotakAngka = new box<>();
        KotakAngka.setIsi(1009);
        System.out.println(KotakAngka.getIsi());        
    }
}   
