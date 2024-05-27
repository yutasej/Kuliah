class Mobil {
    String merk;
    String warna;
    int totalPintu;
    double silinder;
    String bahanBakar;
    String kategori;

    public Mobil(String merk, String warna, int totalPintu, double silinder, String bahanBakar, String kategori){
        this.merk = merk;
        this.warna = warna;
        this.totalPintu = totalPintu;
        this.silinder = silinder;
        this.bahanBakar = bahanBakar;
        this.kategori = kategori;
    }
}

class Honda extends Mobil{
    public Honda(String merk, String warna, int totalPintu, double silinder, String bahanBakar, String kategori){
        super(merk, warna, totalPintu, silinder, bahanBakar, kategori);
    }
    
    void show(){
        System.out.println("Honda");
        System.out.println("Merk Mobil: " +merk);
        System.out.println("Warna Mobil: " +warna);
        System.out.println("Total Pintu: " +totalPintu);
        System.out.println("Silinder: " +silinder);
        System.out.println("Jenis Bahan Bakar: " +bahanBakar);
        System.out.println("Jenis Kategori: " +kategori);
    }
}

class Toyota extends Mobil{
    public Toyota(String merk, String warna, int totalPintu, double silinder, String bahanBakar, String kategori){
        super(merk, warna, totalPintu, silinder, bahanBakar, kategori);
    }

    void show(){
        System.out.println("Toyota");
        System.out.println("Merk Mobil: " +merk);
        System.out.println("Warna Mobil: " +warna);
        System.out.println("Total Pintu: " +totalPintu);
        System.out.println("Silinder: " +silinder);
        System.out.println("Jenis Bahan Bakar: " +bahanBakar);
        System.out.println("Jenis Kategori: " +kategori);
    }
}

public class InheritanceMobil {
    public static void main(String[] args) {
        Honda honda = new Honda("CRV", "Hitam", 4, 5.5, "Pertamax", "Sport");
        Toyota toyota = new Toyota("AVANZA", "Merah", 5, 32.5, "Solar","Off Road");

        honda.show();
        System.out.println("");
        toyota.show();
    }
    
}