abstract class Shapee{
    abstract double  CalculateArea();
}
class Rectanglee extends Shapee{
    double width;
    double height;

    public Rectanglee (double width, double height){
        this.width= width;
        this.height =height;
    }

    @Override
    double CalculateArea(){
        return width*height;
    }
}
class Circlee extends Shapee{
    double radius;

    public Circlee (double radius){
        this.radius= radius;

    }

    @Override
    double CalculateArea(){
        return radius*radius*3.14;
    }
}
class Square extends Shapee{
    double side;

    public Square(double side){
        this.side= side;
    }

    @Override
    double CalculateArea(){
        return side*side;
    }
}
public class Geometric_Shapes {
    public static void main(String[] args){
        Rectanglee rec1 = new Rectanglee(2.0,3.0);
        Circlee cir1 = new Circlee(4.0);
        Square squ1 = new Square(6.2);

        Shapee rec2 = new Rectanglee(4.2, 3.0);
        Shapee cir2 = new Circlee(9.0);
        Shapee squ2 = new Square(7.0);

        System.out.println(rec1.CalculateArea());
        System.out.println(cir1.CalculateArea());
        System.out.println(squ1.CalculateArea());
        System.out.println(rec2.CalculateArea());
        System.out.println(cir2.CalculateArea());
        System.out.println(squ2.CalculateArea());

    }
}
