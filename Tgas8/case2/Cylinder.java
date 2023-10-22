package case2;

public class Cylinder extends Shape{
	private double radius;
    private double height;

    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	@Override
    public String toString() {
        return super.toString() + " of radius  " + radius + "& height " + height; 
    }

}
