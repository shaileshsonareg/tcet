//CW1: DAC Circle with datamember: radius, member function: area, circumference
class Circle {
    int radius;

    public Circle(int r) {
        this.radius = r;
    }
    public void area() {
        double a = 3.14 * radius * radius;
        System.out.printf("Area: %s \n", a);
    }

    public void circumference() {
        double c = 2 * 3.14 * radius;
        System.out.printf("Circ: %s \n", c);
    }
}

class Main {
    public static void main(String[] args) {
        Circle cobj1 = new Circle(5);
        Circle cobj2 = new Circle(7);

        cobj1.area();
        cobj2.circumference();
    }
}
