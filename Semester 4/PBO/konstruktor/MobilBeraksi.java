package konstruktor;

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        
        mbl.setMerk("Avanza");
        mbl.setHarga(2000000);
        mbl.setNo("45U");

        System.out.println(mbl.getMerk());
        System.out.println(mbl.getHarga());
        System.out.println(mbl.getNo());

        mbl.show();
        System.out.println("Merknya adalah: " +mbl.merk);
        System.out.println("Harganya adalah: " +mbl.harga);
        System.out.println("Nomor Platnya adalah: " +mbl.no_plat);
    }
}
