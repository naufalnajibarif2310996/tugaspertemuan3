import java.util.Scanner;
public class cekRibuan {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = input.nextInt();
        
        System.out.println("\nHasil pengecekan:");

        // Mengecek angka pertama
        if (a >= 1000 && a <= 9999) {
            System.out.println("Angka Pertama (" + a + ") adalah ribuan.");
        } else {
            System.out.println("Angka Pertama (" + a + ") bukan ribuan.");
        }
        
        // Mengecek angka kedua
        if (b >= 1000 && b <= 9999) {
            System.out.println("Angka Kedua (" + b + ") adalah ribuan.");
        } else {
            System.out.println("Angka Kedua (" + b + ") bukan ribuan.");
        }
        
        // Mengecek angka ketiga
        if (c >= 1000 && c <= 9999) {
            System.out.println("Angka Ketiga (" + c + ") adalah ribuan.");
        } else {
            System.out.println("Angka Ketiga (" + c + ") bukan ribuan.");
        }
    }
}
