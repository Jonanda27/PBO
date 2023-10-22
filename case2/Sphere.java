package case2;

public class Sphere extends Shape{
	private double radius;
	
	public Sphere(String name, double r) {
		super(name);
		radius = r;
	}
	
	@Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
    
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
	
}
