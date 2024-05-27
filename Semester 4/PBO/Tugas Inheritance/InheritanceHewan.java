class Hewan {
    String nama;
    String jenis;
    int kaki;
    String suara;

    public Hewan(String nama, String jenis, int kaki, String suara){
        this.nama = nama;
        this.jenis = jenis;
        this.kaki = kaki;
        this.suara = suara;
    }
}

class Sapi extends Hewan{
    public Sapi(String nama, String jenis, int kaki, String suara){
        super(nama, jenis, kaki, suara);
    }

    public void show(){
        System.out.println("Nama Hewan: " +nama);
        System.out.println("Jenis Hewan: " +jenis);
        System.out.println("Kaki Hewan: " +kaki);
        System.out.println("Suara Hewan: " +suara);
    }
}

class Kucing extends Hewan{
    public Kucing(String nama, String jenis, int kaki, String suara){
        super(nama, jenis, kaki, suara);
    }

    public void show(){
        System.out.println("Nama Hewan: " +nama);
        System.out.println("Jenis Hewan: " +jenis);
        System.out.println("Kaki Hewan: " +kaki);
        System.out.println("Suara Hewan: " +suara);
    }
}

class Bebek extends Hewan{
    public Bebek(String nama, String jenis, int kaki, String suara){
        super(nama, jenis, kaki, suara);
    }

    public void show(){
        System.out.println("Nama Hewan: " +nama);
        System.out.println("Jenis Hewan: " +jenis);
        System.out.println("Kaki Hewan: " +kaki);
        System.out.println("Suara Hewan: " +suara);
    }
}

class Kambing extends Hewan{
    public Kambing(String nama, String jenis, int kaki, String suara){
        super(nama, jenis, kaki, suara);
    }

    public void show(){
        System.out.println("Nama Hewan: " +nama);
        System.out.println("Jenis Hewan: " +jenis);
        System.out.println("Kaki Hewan: " +kaki);
        System.out.println("Suara Hewan: " +suara);
    }
}

public class InheritanceHewan{
    public static void main(String[] args) {
        Sapi sp = new Sapi("Sapi", "Mamalia", 4, "Mooo");
        Kucing kcg = new Kucing("Kucing", "Mamalia", 4, "Meonggg");
        Bebek bbk = new Bebek("Bebek", "Unggas", 2, "wek wek wek");
        Kambing kbg = new Kambing("Kambing", "Mamalia", 4, "Mbekkkk");

        sp.show();
        kcg.show();
        bbk.show();
        kbg.show();
    }
}