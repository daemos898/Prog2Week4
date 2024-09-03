public class Cone extends Shape { //Create class for the "Cone" shape
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surface_area() { //Create math equation for the surface area of the cone
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * slantHeight + Math.PI * radius * radius;
    }

    public double volume() { //Create math equation for the volume of the cone
        return (1.0/3.0) * Math.PI * radius * radius * height;
    }

    public String toString() { //Create layout for which the cone data will be printed
        return "Cone Data:\n" +
               "Surface Area = " + surface_area() + "\n" +
               "Volume = " + volume() + "\n";
    }
}