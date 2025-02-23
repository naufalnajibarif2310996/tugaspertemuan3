import java.util.Scanner;
public class nilaiTerbesar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = input.nextInt();
        
        int terbesar;
        if (a >= b && a >= c) {
            terbesar = a;
        } else if (b >= a && b >= c) {
            terbesar = b;
        } else {
            terbesar = c;
        }
        
        // Cara lain: Menggunakan Math.max()
        // int terbesar = Math.max(a, Math.max(b, c));
        
        System.out.println("Angka terbesar adalah: " + terbesar);
    }
}
