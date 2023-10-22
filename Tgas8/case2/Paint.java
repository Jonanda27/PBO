package case2;

public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape) {
        double area = shape.area();
        return area / coverage;
    }

    public void printAmount(Shape shape) {
        System.out.println("Amount of paint needed for " + shape.shapeName + ": " + amount(shape) + " liters");
    }
}
