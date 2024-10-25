import java.util.Scanner;

public class RataNilai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        double nilai, totalNilai = 0;
        int jumlahSiswa = 0;
        int siswaDiAtasRata = 0;
        int siswaDiBawahRata = 0;

        while (true) {
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk mengakhiri): ");
            nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai untuk " + nama + ": ");
            nilai = scanner.nextDouble();
            scanner.nextLine(); 

            totalNilai += nilai;
            jumlahSiswa++;

            double rataRata = totalNilai / jumlahSiswa;

            if (nilai >= rataRata) {
                siswaDiAtasRata++;
            } else {
                siswaDiBawahRata++;
            }

            System.out.printf("Rata-rata nilai sementara setelah memasukkan %s: %.2f\n", nama, rataRata);
        }

        if (jumlahSiswa > 0) {
            double rataRataAkhir = totalNilai / jumlahSiswa;
            System.out.println("\n=== Hasil Akhir ===");
            System.out.printf("Rata-rata nilai keseluruhan: %.2f\n", rataRataAkhir);
            System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + siswaDiAtasRata);
            System.out.println("Jumlah siswa dengan nilai di bawah rata-rata: " + siswaDiBawahRata);

            if (siswaDiAtasRata > jumlahSiswa / 2) {
                System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }

    }
}
