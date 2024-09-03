public class Sphere extends Shape { //Create class for the "Sphere" shape
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double surface_area() { //Create math equation to find the surface area of the sphere
        return 4 * Math.PI * radius * radius;
    }

    public double volume() { //Create math equation to find the volume of the sphere
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public String toString() { //Gives the information and format of how the data will be printed
        return "Sphere Data:\n" +
               "Surface Area = " + surface_area() + "\n" +
               "Volume = " + volume() + "\n";
    }
}