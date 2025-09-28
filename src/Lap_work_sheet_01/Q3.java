package Lap_work_sheet_01;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in centimetres: ");
        double centi = input.nextDouble();
     //   System.out.println(centi);
        double inches = centi/2.54;
     //   System.out.println(inches);
        int feet = (int)(inches / 12);
     //   System.out.println(feet);
        double last_inches = inches % 12 ;
        System.out.printf("%.2f cm = %d feet and %.2f inches",centi,feet,last_inches);

    }
}
