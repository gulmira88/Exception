public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(double radius,double  height){
        double result =2* Math.PI * radius*( height + radius);
        return  result;
    }
    public double findVolume(double  radius, double  height){
        double result1=  (Math.PI* radius * radius * height);
        return  result1;

    }

    @Override
    public String toString() {
        return "Cylinder:" +
                "radius:" + radius +
                "\n height:" + height +
                '\n';
    }
}
