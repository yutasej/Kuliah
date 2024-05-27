interface ac{
    public void hidupkanAc();
    public void matikanAc();
    public static final int keadaanMati = 0;
    public static final int keadaanHidup = 1;
}

class acBeraksi implements ac{
    int status;
    
    public void hidupkanAc(){
        if (status == keadaanMati ) {
            status = keadaanHidup;
            System.out.println("Status AC -> AC Hidup");
        } else {
            System.out.println("Status AC -> AC Sudah Hidup Bos!");
        }
    }

    public void matikanAc(){
        if (status == keadaanHidup) {
            status = keadaanMati;
            System.out.println("Status AC -> AC Mati");
        } else {
            System.out.println("Status AC -> AC Sudah Mati Bos!");
        }
    }
}

interface langkahKaki{
    public void langkahKanan();
    public void langkahKiri();
    public static final int langkahKiri = 0;
    public static final int langkahKanan = 1;
}

class langkahBeraksi implements langkahKaki{
    int status;

    public void langkahKanan(){
        if (status == langkahKiri) {
            status = langkahKanan;
            System.out.println("Status Langkah Kaki -> Langkah Kaki Ke Kanan");
        } else {
            System.out.println("Status Langkah Kaki -> Langkah Kaki Sudah Ke Kanan Bos!");
        }
    }

    public void langkahKiri(){
        if (status == langkahKanan) {
            status = langkahKiri;
            System.out.println("Status Langkah Kaki -> Langkah Kaki Ke Kiri");
        } else {
            System.out.println("Status Langkah Kaki -> Langkah Kaki Sudah Ke Kiri Bos!");
        }
    }
}

public class Interface {
public static void main(String[] args) {
    acBeraksi airc = new acBeraksi();
    langkahBeraksi langkah = new langkahBeraksi();

    airc.hidupkanAc();
    airc.matikanAc();
    airc.hidupkanAc();
    airc.hidupkanAc();
    airc.matikanAc();
    airc.matikanAc();
    System.out.println("====================================================");
    langkah.langkahKanan();
    langkah.langkahKiri();
    langkah.langkahKanan();
    langkah.langkahKanan();
    langkah.langkahKiri();
    langkah.langkahKiri();
}    
}