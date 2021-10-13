package vn.edu.hcmus.fit.ndhuy.helloJava.basic;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava.basic
 * Created by ndhuy
 * Date 13/10/2021 - 14:58
 * Description: ...
 */
public class BaiTap01 {
    /**
     * Main function
     * @param argv input parameter
     */
    public static void main(String[] argv) {
        int n;
        Scanner scanner = new Scanner(System.in);

        // Enter Integer number
        do {
            System.out.print("Enter an Integer number (3 < n < 50): ");
            n = scanner.nextInt();

            // Alert if error
            if (n <= 3 || n > 50)
                System.out.println("N is invalid. Please, try again: ");
        } while (n <= 3 || n > 50);

        // Sum from 1 to N
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;

        // Print
        System.out.println("Sum = " + sum);
    }
}
