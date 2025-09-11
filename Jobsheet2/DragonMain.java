public class DragonMain {
    public static void main(String[] args) {
        
        Dragon dragon1 = new Dragon(0, 0, 1);
        Dragon dragon2 = new Dragon(3, 2, 2);

        System.out.println("===== Informasi DIrection Dragon =====");
        System.out.println("1 = Atas");
        System.out.println("2 = Kanan");
        System.out.println("3 = Bawah");
        System.out.println("4 = Kiri");

        System.out.println("======================================");
        System.out.println("\n========== Dragon 1 ==========");
        System.out.println("---- Status Awal ----");
        dragon1.printStatus();
        System.out.println("---- Bergerak 2 langkah ----");
        dragon1.move(2);
        dragon1.printStatus();
        System.out.println("---- Berubah arah ke bawah ----");
        dragon1.changeDirection(3);
        dragon1.printStatus();
        System.out.println("---- Bergerak 4 langkah ----");
        dragon1.move(4);
        dragon1.printStatus();
        System.out.println("---- Berubah arah ke kanan dan bergerak 2 langkah ----");
        dragon1.changeDirection(2);
        dragon1.move(2);
        dragon1.printStatus();
        
        System.out.println("\n========== Dragon 2 ==========");
        System.out.println("---- Status Awal ----");
        dragon2.printStatus();
        System.out.println("---- Bergerak 6 langkah ----");
        dragon2.move(6);
        dragon2.printStatus();
        System.out.println("---- Berubah arah ke atas dan bergerak 2 langkah ----");
        dragon2.changeDirection(1);
        dragon2.move(2);
        dragon2.printStatus();

    }
}
