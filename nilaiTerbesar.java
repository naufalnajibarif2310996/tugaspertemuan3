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
        
         if (a == b && b == c) {
            System.out.println("Semua angka sama, tidak ada yang terbesar.");
        } else {
            int terbesar = a;
            if (b > terbesar) {
                terbesar = b;
            } 
            
            if (c > terbesar) {
                terbesar = c;
            } 
            
            if (terbesar == a && a == b){
                System.out.println("Terdapat 2 angka terbesar yaitu: " + terbesar + " di angka pertama dan kedua");
            } else if (terbesar == a && a == c){
                System.out.println("Terdapat 2 angka terbesar yaitu: " + terbesar + " di angka pertama dan ketiga");
            } else if (terbesar == b && b == c){
                System.out.println("Terdapat 2 angka terbesar yaitu: " + terbesar + " di angka kedua dan ketiga");
            } else{
                System.out.println("Angka terbesar yaitu: " + terbesar);
            }
        
         }
         
         // Cara lain: Menggunakan Math.max()
//        int terbesar = Math.max(a, Math.max(b, c));
//        
//        System.out.println("Angka terbesar yaitu: " + terbesar);
    }
}    

        
        
    