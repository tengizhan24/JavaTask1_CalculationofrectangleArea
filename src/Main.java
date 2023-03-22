import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public RectangleArea() {
        this.length = 0;
        this.width = 0;
        this.area = 0;
    }

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        this.length = input.nextDouble();
        System.out.print("Enter width of rectangle: ");
        this.width = input.nextDouble();
    }

    public void computeArea() {
        this.area = this.length * this.width;
    }

    public void displayArea() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.area);
    }
}

public class Main {
    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea();
        rect.getData();
        rect.computeArea();
        rect.displayArea();
    }
}