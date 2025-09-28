package Lap_work_sheet_01;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter inner radius (ri): ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = input.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);


        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();


        System.out.printf("The area of the circle is: %.2f%n", shadedArea);
    }
}
