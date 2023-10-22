package case2;

public class Rectangle extends Shape{
	private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
	@Override
    public String toString() {
        return super.toString() + " of length  " + length + "& width " + width; 
    }

}
