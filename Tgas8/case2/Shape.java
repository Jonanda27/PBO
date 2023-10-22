package case2;

public abstract class Shape {
	protected String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    public abstract double area();

    public String toString() {
        return "name of shape : " +shapeName;
    }
}
