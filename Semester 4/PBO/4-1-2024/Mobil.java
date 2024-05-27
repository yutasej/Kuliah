class Mobil {
    public void mobilJalan(){
        System.out.println("Masukkan gigi 1 tekan kopling dan gass");
    }    

}

class mobilMatic extends Mobil {
    @Override
    public void mobilJalan(){
        System.out.println("Posisi di D dan gass");
    }
}

class mobilTruk extends Mobil {
    public void mobilJalan(){
        super.mobilJalan();
    }
}

class testOverride {
    public static void main(String[] args) {
        Mobil manual = new Mobil();
        Mobil matic = new mobilMatic();
        Mobil truk = new mobilTruk();

        manual.mobilJalan();
        matic.mobilJalan();
        truk.mobilJalan();
    }    
}
