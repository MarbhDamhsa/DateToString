package a1datetostring;

import java.util.Scanner;

public class MainApp{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //while( true )
        for (;;) {
            // get user input
            System.out.println("Enter date in MM/DD/YYYY format or 0 to exit>>>");
            System.out.println("_______________________________________________");
            String inp = sc.next();
            if (inp.equals("0")) {
                return;
            }
            // expecting date in format mm/dd/yyyy
            String[] parts = inp.split("/");
            if (parts.length != 3) {
                System.out.println("***Warning bad format -- three parts required");
                continue;
            }
            // convert and display results
            System.out.println(
                    StringUtils.month2string(parts[0])
                    + " "
                    + StringUtils.day2string(parts[1])
                    + " "
                    + StringUtils.year2words(parts[2])
            );

        }//for
    }//main
}//class StringsMain
