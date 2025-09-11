public class Dragon {
    int x, y, direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

        if (direction >= 1 && direction <= 4) {
            this.direction = direction;
        } else {
            this.direction = 2;
        }
    }
    void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("Input Tidak Sesuai. Pilih antara 1 sampai 4.");
        }
    }
    void move(int steps){
        switch (direction) {
            case 1: // Dowm
                y += steps;
                break;
            case 2: // Right
                x += steps;
                break;
            case 3: // Up
                y -= steps;
                break;
            case 4: // Left
                x -= steps;
                break;
            default:
                System.out.println("Arah tidak valid");
        }
    }
    void printStatus(){
        String directionStatus;
        switch (this.direction) {
            case 1:
                directionStatus = "Atas";
                break;
            case 2:
                directionStatus = "Kanan";
                break;
            case 3:
                directionStatus = "Bawah";
                break;
            case 4:
                directionStatus = "Kiri";
                break;
            default:
                directionStatus = "Tidak diketahui";
                break;
        }

        System.out.println("Koordinat\t: " + "(" + this.x + "," + this.y + ")");
        System.out.println("Arah\t\t: " + directionStatus);
        System.out.println("\n");
    }
}
