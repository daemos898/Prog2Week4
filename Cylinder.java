public class Cylinder extends Shape { //Create class for the "Cylinder" shape
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surface_area() { //Create math equation for surface area of the cylinder
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume() { //Create math equation for the volume of the cylinder
        return Math.PI * radius * radius * height;
    }

    public String toString() { //Create layout for the information to be printed for the cylinder data
        return "Cylinder Data:\n" +
               "Surface Area = " + surface_area() + "\n" +
               "Volume = " + volume() + "\n";
    }
}