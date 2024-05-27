import java.util.Scanner;

public class A11202214505 {
    public static void main(String[] args) {
        int pilih, saldo = 100000, tabung = 150000; 
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String ya="Y";

        while (ya.equals("Y") || (ya.equals("y"))) {
            System.out.println("Menu ATM");
            System.out.print("1. Cek Saldo");
            System.out.print(" 2. Simpan Uang");
            System.out.print(" 3. Ambil Uang");
            System.out.println(" 4. Keluar");

            System.out.print("Pilih Menu: ");            
            pilih = sc.nextInt();

            if (pilih == 1) {
                System.out.println("Saldo Anda Adalah Rp. " +saldo);
            } else if (pilih == 2) {
                System.out.println("Jumlah Uang Yang Anda Simpan Rp. " +tabung);
                int hasilJumlah = saldo + tabung;
                saldo = hasilJumlah;
                System.out.println("Saldo Anda Adalah Rp. " +hasilJumlah);
            } else if (pilih == 3) {
                System.out.println("Jumlah Uang Yang Anda Ambil Rp. " +tabung);
                if (tabung > saldo){
                    System.out.println("Saldo Anda Tidak Mencukupi");
                    continue;
                }
                int hasilKurang = saldo - tabung;
                saldo = hasilKurang;
                System.out.println("Saldo Anda Adalah Rp. " +hasilKurang);
            } else {
                break;
            }
            System.out.print("Pilih Lagi [Y/N] ?: ");
            ya = sc1.nextLine();
        }
    }
}
