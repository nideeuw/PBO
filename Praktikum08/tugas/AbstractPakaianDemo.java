package Praktikum08.tugas;

public class AbstractPakaianDemo {
    public static void main(String[] args) {
        Celana celana1 = new Celana("Bershka", "34", "Putih", "Katun", 3000000, "Highwaist", 80);
        
        System.out.println("==================== Celana ====================");
        celana1.getInfoPakaian();
        System.out.println();
        celana1.pakai();
        celana1.gulungUjung();
        
        System.out.println("Ukuran celana sebelum diubah: " + celana1.ukuran);
        celana1.ubahUkuran("32");
        System.out.println();
        celana1.getInfoPakaian();
        System.out.println("=================================================");
        
        System.out.println();

        Baju baju1 = new Baju("Uniqlo", "L", "Hitam", "Katun", 250000, "Kaos", "Pendek");
        
        System.out.println("==================== Baju ======================");
        baju1.getInfoPakaian();
        System.out.println();
        baju1.pakai();
        baju1.setelLengan();
        
        System.out.println("Ukuran baju sebelum diubah: " + baju1.ukuran);
        baju1.ubahUkuran("M");
        System.out.println();
        baju1.getInfoPakaian();
        System.out.println("=================================================");
    }
}