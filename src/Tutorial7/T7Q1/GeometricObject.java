package Tutorial7.T7Q1;

abstract class GeometricObject {
    protected String color;

    protected GeometricObject(){};

    protected GeometricObject(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    abstract double findArea();
}
