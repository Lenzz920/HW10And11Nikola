package HW10.Shapes;

public class Main {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(2, 5);
        Circle cir = new Circle(10);

        System.out.println(rec.calculateArea());
        System.out.println(rec.calculatePerimeter());
        System.out.println();

        System.out.println(cir.calculateArea());
        System.out.println(cir.calculatePerimeter());
    }

}
