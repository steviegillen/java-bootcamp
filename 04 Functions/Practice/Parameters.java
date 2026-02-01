public class Parameters {
    public static void main (String[] args) {
        calculateArea(2, 5);
        calculateArea(2.6, 3.8);
        calculateArea(1.6, 2.4);
    }

    public static void calculateArea(double width, double height) {
        double area = width * height;
        System.out.println("Area: " + area);
    }
}
