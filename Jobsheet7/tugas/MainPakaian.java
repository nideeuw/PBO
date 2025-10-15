public class MainPakaian {
    public static void main(String[] args) {
        // Membuat objek Celana dan Baju
        Celana celana = new Celana("Levi's", "M", "Hitam", "Denim", 500000, "Jeans", 110);
        Baju baju = new Baju("Zara", "L", "Putih", "Katun", 250000, "Kaos", "Pendek");

         // Menampilkan Info Pakaian Celana
        System.out.println("=====================================");
        System.out.println("Informasi Celana:");
        System.out.println("-------------------------------------");
        celana.infoPakaian();
        
        System.out.println();
        
        // Menampilkan Info Pakaian Baju
        System.out.println("=====================================");
        System.out.println("Informasi Baju:");
        System.out.println("-------------------------------------");
        baju.infoPakaian();
    }
}