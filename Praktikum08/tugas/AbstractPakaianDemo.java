package Praktikum08.tugas;

public class AbstractPakaianDemo {
    public static void main(String[] args) {
        // Membuat objek Celana
        Celana celana1 = new Celana("Bershka", "34", "Putih", "Katun", 3000000, "Highwaist", 80);
        
        // Menampilkan info Celana sebelum dan sesudah perubahan ukuran
        System.out.println("==================== Celana ====================");
        celana1.getInfoPakaian();
        System.out.println();
        celana1.pakai();
        celana1.gulungUjung();
        
        // Menampilkan ukuran sebelum dan setelah diubah
        System.out.println("Ukuran celana sebelum diubah: " + celana1.ukuran);
        celana1.ubahUkuran("32");
        System.out.println("Ukuran celana diubah menjadi: " + celana1.ukuran);
        System.out.println();
        celana1.getInfoPakaian();
        System.out.println("=================================================");
        
        System.out.println(); // Pemisah antara Celana dan Baju

        // Membuat objek Baju
        Baju baju1 = new Baju("Uniqlo", "L", "Hitam", "Katun", 250000, "Kaos", "Pendek");
        
        // Menampilkan info Baju sebelum dan sesudah perubahan ukuran
        System.out.println("==================== Baju ======================");
        baju1.getInfoPakaian();
        System.out.println();
        baju1.pakai();
        baju1.setelLengan();
        
        // Menampilkan ukuran sebelum dan setelah diubah
        System.out.println("Ukuran baju sebelum diubah: " + baju1.ukuran);
        baju1.ubahUkuran("M");
        System.out.println("Ukuran baju diubah menjadi: " + baju1.ukuran);
        System.out.println();
        baju1.getInfoPakaian();
        System.out.println("=================================================");
    }
}