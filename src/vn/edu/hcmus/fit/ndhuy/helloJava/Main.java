package vn.edu.hcmus.fit.ndhuy.helloJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava
 * Created by ndhuy
 * Date 13/10/2021 - 14:09
 * Description: ...
 */
public class Main {
    /**
     ** main function
     ** @param argv parameter from terminal
     * */
    public static void main(String[] argv) {
        int a = 100;
        String s_a = String.valueOf(a);
        System.out.println(s_a);

        Integer i_a = Integer.valueOf(a);
        String s_i_a = i_a.toString();
        System.out.println(s_i_a);

        String value = "12.345";
        float f_value = Float.valueOf(value).floatValue();
        System.out.println(f_value);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date today = sdf.parse("13/10/2021");
            System.out.println(today.toString());

            String sDate = sdf.format(today);
            System.out.println(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Enter an Integer number: ");
        Scanner scanner = new Scanner(System.in);
        int i_value = scanner.nextInt();
        System.out.println("Value is: " + i_value);

        String sResult = String.format("Value is %d", i_value);
        System.out.println(sResult);
    }
}
