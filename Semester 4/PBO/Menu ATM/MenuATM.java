import java.util.Scanner;

public class MenuATM {
    public static void main(String[] args) {
     int pilih, saldo = 100000;
     String ya = "Y";
     Scanner sc = new Scanner(System.in);
     Scanner sc1 = new Scanner(System.in);
     
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
        } else if (pilih == 2){
            System.out.print("Masukkan Uang Yang Ingin Anda Simpan Rp. ");
            int uang = sc.nextInt();
            System.out.println("Jumlah Uang Yang Anda Simpan Adalah Rp. " +uang);
            int hasilJumlah = saldo + uang;
            saldo = hasilJumlah;
            System.out.println("Saldo Anda Adalah Rp. " +hasilJumlah);
        } else if (pilih == 3) {
            System.out.print("Masukkan Uang Yang Ingin Anda Ambil Rp. ");
            int uang = sc.nextInt();
            System.out.println("Jumlah Uang Yang Ingin Anda Ambil Adalah Rp." +uang);
            int hasilKurang = saldo - uang;
            saldo = hasilKurang;
            if (uang > saldo) {
                System.out.println("Maaf Saldo Anda Tidak Mencukupi");
                continue;
            }
            System.out.println("Saldo Anda Adalah Rp." +hasilKurang);
        } else {
            break;
        }
        System.out.print("Ingin Melakukan Transaksi Lagi [Y/N] ?: ");
        ya = sc1.nextLine();
     }
    }    
}