package Lap_work_sheet_01;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd-length word:");
        String name = input.next();
      //  System.out.println(name);
        int name_length = name.length();
      //  System.out.println(name_length);
        int mid_char_length = (name_length+1)/2;
        int letter = mid_char_length - 1 ;
        char mid_letter = name.charAt(letter);

        System.out.println("middle letter of your word is : "+ mid_letter);

    }
}
