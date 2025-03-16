class Shape{
    String color;

    Shape(String color){
        this.color=color;
    }
}
class Rectangle extends Shape{
    double width=0.0;
    double height=0.0;

    Rectangle(String color, double width, double height){
        super(color);
        this.width= width;
        this.height= height;

    }
    double calculateArea(){
        return width*height;

    }

}
class Circle extends Shape{
    double radius=0.0;

    Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }

    double calculateCircleArea(){
        return Math.PI*radius*radius;
    }
}
public class CalculateArea {
    public static void main(String[] argss){
        Rectangle rectangle= new Rectangle("red", 6.0, 5.0);
        Circle circle = new Circle ("green", 4.0);

        System.out.println("----RECTANGLE-----");
        System.out.println("The area: "+ rectangle.calculateArea());
        System.out.println("The color: "+ rectangle.color);

        System.out.println("----Circle----");
        System.out.println("The area: "+ circle.calculateCircleArea());
        System.out.println("The color: "+ circle.color);


    }

}
