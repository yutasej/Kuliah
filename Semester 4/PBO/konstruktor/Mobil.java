package konstruktor;

public class Mobil {
    public String merk;
    public int harga;
    public String no_plat;

    public void setMerk(String newMerk){
        this.merk = newMerk;
    }

    public void setHarga(int newHarga){
        this.harga = newHarga;
    }

    public void setNo(String newNo){
        this.no_plat = newNo;
    }

    public String getMerk(){
        return this.merk;
    }
    
    public int getHarga(){
        return this.harga;
    }

    public String getNo(){
        return this.no_plat;
    }

    void show(){
        System.out.print("Merk Mobil: " + getMerk());
        System.out.print("Merk Mobil: " + getHarga());
        System.out.print("Merk Mobil: " + getNo());
    }
}
