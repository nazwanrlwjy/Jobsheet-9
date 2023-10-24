import java.util.Scanner;
public class FiturDaftarHarga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.print("Banyak barang yang akan di input : ");
        int barang = sc.nextInt();
        System.out.println("\n");

        String nama[] = new String[barang];
        int harga[] = new int[barang];
        int jumlah[] = new int[barang];
        int total[] = new int[barang];
        int tot=0;

        for (int b = 0; b < barang; b++){
            System.out.print("Nama Barang "+(b+1)+" = ");
            nama[b] = sc.next();
            System.out.print("Harga "+nama[b]+ " = ");
            harga[b] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("=====Daftar Nama dan Harga Barang=====");
        System.out.println("\t\t\t  \t\t\t");
        for (int c = 0; c < barang; c++){
            System.out.println("Barang ke- "+(c+1));
            System.out.println("1. Nama Barang   = "+nama[c]);
            System.out.println("2. Harga Barang  = "+harga[c]);
        }
    }
}