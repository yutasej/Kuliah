import java.util.Scanner;

public class MenuMakanan {
    static void showMenu(){
        System.out.println("Nasi");
        System.out.println("=====================");
        System.out.println("1. Nasi Rames");
        System.out.println("2. Nasi Goreng");
        System.out.println("3. Nasi Gudeg");
        System.out.println("4. Nasi Kebuli");
        System.out.println("=====================");
    }
public static void main(String[] args) {
    int pilih;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    String ya = "Y";
    
    while (ya.equals("Y") || ya.equals("y")) {
        showMenu();
        System.out.print("Pilih Menu: ");
        pilih = sc.nextInt();

        if (pilih == 1) {
            System.out.println("Anda Memilih Nasi Rames");
        } else if (pilih == 2) {
            System.out.println("Anda Memilih Nasi Goreng ");
        } else if (pilih == 3) {
            System.out.println("Anda Memilih Nasi Gudeg");
        } else if (pilih == 4) {
            System.out.println("Anda Memilih Nasi Kebuli");
        } else {
            System.out.println("Anda Tidak Memilih Menu Apapun");
        }
        System.out.print("Pilih Lagi [Y/N] ? ");
        ya = sc1.nextLine();
        if (ya.equals("N") || ya.equals("n")) {
            System.out.println("Selamat Tinggal!!");
            break;
        }
    }
}    
}