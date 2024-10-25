import java.util.Scanner;

public class StokBarang05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaBarang;
        double totalNilaiStok = 0;

        while (true) {
            System.out.print("Masukkan nama barang (atau ketik 'selesai' untuk mengakhiri): ");
            namaBarang = scanner.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok untuk barang " + namaBarang + ": ");
            int stok = scanner.nextInt();

            System.out.print("Masukkan harga per unit barang " + namaBarang + ": ");
            double hargaPerUnit = scanner.nextDouble();

            double nilaiStok = stok * hargaPerUnit;
            totalNilaiStok += nilaiStok;
            System.out.printf("Total nilai stok untuk %s: %.2f\n", namaBarang, nilaiStok);

            System.out.print("Masukkan jumlah permintaan untuk barang " + namaBarang + ": ");
            int permintaan = scanner.nextInt();

            if (permintaan <= stok) {
                System.out.printf("Permintaan dapat dipenuhi. Sisa stok: %d\n", stok - permintaan);
            } else {
                System.out.println("Permintaan tidak dapat dipenuhi. Stok tidak mencukupi.");
            }

            System.out.println(); 
            scanner.nextLine(); 
        }

        System.out.println("Program berakhir.");
        System.out.printf("Total nilai stok keseluruhan: %.2f\n", totalNilaiStok);
    }
}
