class Hewan {
    String suara;
    String nama;

    public void namaHewan (String nama){
        this.nama=nama;
        System.out.println("Nama Hewan: " +this.nama);
    }

    public void suaraHewan (String suara){
        this.suara=suara;
        System.out.println("Suara Hewan: " +this.suara);
    }
}

class Anjing extends Hewan{

}

class Kucing extends Hewan{
    
}