class DataMahasiswa{
    String nama;
    String nim;
    String alamat;

    public void setNama(String newNama){
        this.nama = newNama;
    }

    public void setNim(String newNim){
        this.nim = newNim;
    }

    public void setAlamat(String newAlamat){
        this.alamat = newAlamat;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public String getAlamat(){
        return this.alamat;
    }
}

public class Mahasiswa{
    public static void main(String[] args) {
        DataMahasiswa data = new DataMahasiswa();

        data.setNama("Yutase");
        data.setNim("A11.2022.14505");
        data.setAlamat("Jl. Kanguru Utara VI No. 1");

        System.out.println("Nama Saya: " +data.getNama());
        System.out.println("NIM Saya: " +data.getNim());
        System.out.println("Alamat Saya: " +data.getAlamat());
    }
}