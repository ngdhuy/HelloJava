package vn.edu.hcmus.fit.ndhuy.helloJava.array;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava.array
 * Created by ndhuy
 * Date 13/10/2021 - 15:58
 * Description: ...
 */
public class Demo01 {
    /**
     * Main funtion
     * @param argv parameter input form terminal
     */
    public static void main(String[] argv) {
        int[] a = {1, 2, 3, 4, 5};
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + "\t");

        System.out.println();
        // for each
        for(int item : a)
            System.out.print(item + "\t");

        printArray(a);
    }

    /**
     * Print array to Console
     * @param a Array of integer
     */
    public static void printArray(int[] a) {
        System.out.println();
        for (int item : a)
            System.out.print(item + "\t");
        System.out.println();
    }
}
