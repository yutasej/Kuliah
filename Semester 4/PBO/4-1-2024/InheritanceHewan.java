class InheritanceHewan{
    public static void main (String args[]){
        Hewan cat = new Kucing();
        Hewan dog = new Anjing();

        cat.namaHewan("Kucing");
        cat.suaraHewan("meoww");

        dog.namaHewan("Anjing");
        dog.suaraHewan("gukk");
    }
}