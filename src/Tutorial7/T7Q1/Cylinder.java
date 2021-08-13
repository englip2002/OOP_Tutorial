package Tutorial7.T7Q1;

public class Cylinder extends Circle{
    private double length;

    public Cylinder(){};

    public Cylinder(double length, double radius, String color){
        super(color, radius);
        this.length=length;
    }

    public double findVolume(){
        return findArea()*length;
    }
}
