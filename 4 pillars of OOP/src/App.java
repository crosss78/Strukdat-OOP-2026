public class App {
    public static void main(String[] args) throws Exception {
        Karakter c1 = new Mage("MIYA",100);
        Karakter c2 = new Assassin("ASEP",50);

        c1.tampilkan();
        System.out.println();
        c2.tampilkan();
    }
}

abstract class Karakter {

    private String nama;
    private int level;

    public Karakter(String nama, int level){
        this.nama = nama;
        this.level = level;
    }

    public String getNama(){
        return nama;
    }

    public int getLevel(){
        return level;
    }

    public void tampilkan(){
        System.out.println("NAMA  : " + nama);
        System.out.println("ROLE  : " + getRole());
        System.out.println("LEVEL : " + level);
    }

    // abstraction
    abstract String getRole();
}

//inheret
class Mage extends Karakter {

    public Mage(String nama, int level){
        super(nama, level);
    }

    @Override
    String getRole(){
        return "MAGE";
    }
}

class Assassin extends Karakter {

    public Assassin(String nama, int level){
        super(nama, level);
    }

    @Override
    String getRole(){
        return "ASSASSIN";
    }
}
