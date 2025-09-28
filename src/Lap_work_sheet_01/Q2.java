package Lap_work_sheet_01;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name(first middle last):");
        String full_name = input.nextLine();
        // System.out.println(full_name);
        String[] names = full_name.split(" ");
     //   System.out.println(names[0]);
     //   System.out.println(names[1]);
     //   System.out.println(names[2]);
         String fname = names[0];
         String mname = names[1];
         String lname = names[2];

         char middle_initial = mname.charAt(0);

        System.out.println("Hello..!");
        System.out.println(lname+","+" "+fname+" "+middle_initial);
    }

}
