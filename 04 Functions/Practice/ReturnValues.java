public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.5, 2);
        double area2 = calculateArea(3.2, 1.3);
        double area3 = calculateArea(2, 2.8);
        System.out.println("Area 1: " + area1);
        System.out.println("Area 2: " + area2);
        System.out.println("Area 3: " + area3);
        
    }
    public static double calculateArea(double width, double height) {
        double area = width * height;
        return area;
    }
}
