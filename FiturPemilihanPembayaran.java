import java.util.Scanner;
class FiturPilihanPembayaran {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] menu = {"Mie Sedap Kuah", "Mie Sedap Goreng", "Indomie Kuah", "Indomie Goreng", "Mie Gaga Jumbo", "Pop Mie Jumbo"};
        int[] harga = {3500, 4000, 4500, 5000, 5500, 6000};

        System.out.println("Menu Produk Mie :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih menu (nomor) atau ketik 0 untuk selesai: ");
        int totalHarga = 0;

        while (true) {
            int pilihan = scanner.nextInt();
            if (pilihan == 0) {
                break;
            }

            if (pilihan >= 1 && pilihan <= menu.length) {
                int index = pilihan - 1;
                System.out.println("Anda memesan: " + menu[index] + " - Rp" + harga[index]);
                totalHarga += harga[index];
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Pilih menu lain (nomor) atau ketik 0 untuk selesai: ");
        }

        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.print("Pilih metode pembayaran (Tunai/Kartu Kredit): ");
        String metodePembayaran = scanner.next();

        if (metodePembayaran.equalsIgnoreCase("Tunai")) {
            System.out.print("Tunai (masukkan jumlah uang): Rp");
            int uangTunai = scanner.nextInt();
            int kembalian = uangTunai - totalHarga;
            if (kembalian >= 0) {
                System.out.println("Kembalian: Rp" + kembalian);
            } else {
                System.out.println("Uang tunai tidak mencukupi.");
            }
        } else if (metodePembayaran.equalsIgnoreCase("Kartu Kredit")) {
            System.out.println("Pembayaran dengan Kartu Kredit berhasil.");
        } else {
            System.out.println("Metode pembayaran tidak valid.");
        }

        System.out.println("Terima kasih telah belanja di Minimarket kami!");
    }
}