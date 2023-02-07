package HW20;

public class ShapeTask {
    double radius;
    ShapeTask(double radius){
        this.radius=radius;
    }
}
class Circle extends ShapeTask{
    double pi;
    Circle(double radius, double pi){
        super(radius);
        this.pi=pi;
    }
    void area(){
        System.out.println("The area of circle is "+(radius*pi*pi));
    }
}
