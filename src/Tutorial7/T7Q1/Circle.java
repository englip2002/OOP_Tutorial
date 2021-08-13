package Tutorial7.T7Q1;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){};
    
    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.1415926*Math.pow(radius, 2);
    }


}
