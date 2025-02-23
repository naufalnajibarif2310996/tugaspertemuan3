import java.util.Scanner;
public class biayaParkir {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jam masuk (0-23): ");
        int jamMasuk = input.nextInt();
        System.out.print("Masukkan jam keluar (0-23): ");
        int jamKeluar = input.nextInt();
        
        if (jamMasuk < 0 || jamMasuk > 23 || jamKeluar < 0 || jamKeluar > 23) {
            System.out.println("Jam tidak valid. Harap masukkan angka antara 0-23.");
        } else if (jamKeluar < jamMasuk) {
            System.out.println("Batas parkir hanya sampai jam 23.");
        } else {
            int lamaParkir = jamKeluar - jamMasuk;
            int biaya;
            
            if (lamaParkir <= 2) {
                biaya = 1500; // Biaya tetap jika ≤ 2 jam
            } else {
                biaya = 1500 + (lamaParkir - 2) * 1000; // Biaya tambahan setelah 2 jam pertama
            }
            
            System.out.println("Lama parkir: " + lamaParkir + " jam.");
            System.out.println("Biaya parkir: Rp " + biaya);
        }
    }
}
