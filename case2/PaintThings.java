package case2;

public class PaintThings {
    public static void main(String[] args) {
        // Membuat objek cat dengan cakupan 350 sq. ft per liter
        Paint paint = new Paint(350);

        // Instantiate the three shape objects
        Shape deck = new Rectangle("Deck", 20, 35);
        Shape bigBall = new Sphere("Big Ball", 15);
        Shape tank = new Cylinder("Tank", 10, 30);

        // Menghitung jumlah cat yang dibutuhkan
        paint.printAmount(deck);
        paint.printAmount(bigBall);
        paint.printAmount(tank);
    }
}

