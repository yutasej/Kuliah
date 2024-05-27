public class A11202214505 {
    public static void main(String[] args) {
        simbah a = new simbah("Bonar", "Anak");
        anak_simbah b = new cucu_simbah("Nanik", "Cucu");
        a.show_simbah();
        b.show_simbah();
    }
}

class simbah {
    String nama;
    String status;
    public simbah(String nama, String status){
        this.nama = nama;
        this.status = status;
    }
    void show_simbah(){
        System.out.println("Ini Adalah: " +this.nama);
        System.out.println("Ini Adalah: " +this.status);
    }
    void show_simbah(String c){
        System.out.println(c);
    }
}

class anak_simbah extends simbah {
    public anak_simbah(String nama, String status){
        super(nama, status);
    }
    void show_anak(){
        System.out.println(this);
    }
}

class cucu_simbah extends anak_simbah {
    public cucu_simbah(String nama, String status){
        super(nama, status);
        super.show_simbah("Mbah Kakung");
    }
}
