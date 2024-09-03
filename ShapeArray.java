public class ShapeArray { //Create the class for the array that will store and print the data of each shape
	
    public static void main(String[] args) {
    	
        Shape[] shapeArray = new Shape[3]; //Create the array and each listing for each of the different shapes, also creates parameters for the size of the shapes
        shapeArray[0] = new Sphere(12);
        shapeArray[1] = new Cylinder(16, 22);
        shapeArray[2] = new Cone(14, 18);

        for (int i = 0; i < shapeArray.length; i++) { //Create for statement to run through each shape and print their information
            System.out.println(shapeArray[i].toString());
        }
    }
}