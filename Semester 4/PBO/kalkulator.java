import java.util.Scanner;

class kalkulator{
    static void kalku(){
        System.out.println("1. TAMBAH");
        System.out.println("2. KURANG");
        System.out.println("3. KALI");
        System.out.println("4. BAGI");
        System.out.println("5. KELUAR");
    }
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String ya="Y";

        System.out.println("Kalkulator Sederhana");
        System.out.println("========================");

        while (ya.equals("Y") || (ya.equals("y"))) {
            kalku();

            System.out.println("========================");
            System.out.println("Pilih Operasi Bilangan: ");
            
            pilih = sc.nextInt();
            if (pilih==1) {
                System.out.println("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.println("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                int hasilTambah = angka1 + angka2;
                System.out.println("Hasilnya Adalah: " +hasilTambah);
            }else if(pilih==2){
                System.out.println("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.println("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                int hasilKurang = angka1 - angka2;
                System.out.println("Hasilnya Adalah: " +hasilKurang);
            }else if(pilih==3){
                System.out.println("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.println("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                int hasilKali = angka1 * angka2;
                System.out.println("Hasilnya Adalah: " +hasilKali);
            }else if(pilih==4){
                System.out.println("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.println("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                float hasilBagi = (float) angka1 / angka2;
                System.out.println("Hasilnya Adalah: " +hasilBagi);
            }else{
                break;
            }
            System.out.println("Ingin Lanjut Y/N ?");
            ya = sc1.nextLine();
        }
        

    }

}