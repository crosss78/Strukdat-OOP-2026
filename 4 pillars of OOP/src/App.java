public class App {
    public static void main(String[] args) throws Exception {
        
        Hewan hewan1 = new Kucing("Tom", 2);
        Hewan hewan2 = new Ayam("Rembo", 1);

        System.out.print("Nama hewannya: " + hewan1.getNama() + ", ");
        hewan1.Suara();

        System.out.print("Nama hewannya: " + hewan2.getNama() + ", ");
        hewan2.Suara();
    }
}


abstract class Hewan {
    
    //Enkapsulasi
    private String nama;
    private int umur;

    //constructor
    public Hewan (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Egetter
    public String getNama() {
        return nama;
    
    }
    public int getUmur() {
        return umur;
    }

    //abstraction
    abstract void Suara();
}

//inheritance
class Kucing extends Hewan {
    public Kucing (String nama, int umur){
        super(nama, umur);
    }

    //semua yang override ini masuknya ke polimorpism, ini masuknya polymorphism dengan method overriding 
    @Override
    void Suara(){
        System.out.println("suara Kucing: meong meong meong");
    }
}

class Ayam extends Hewan {
    public Ayam (String nama, int umur){
        super(nama, umur);
    }

    //semua yang override ini masuknya ke polimorpism
    @Override
    void Suara(){
        System.out.println("suara Ayam: kukuruyukkk");
    }
}