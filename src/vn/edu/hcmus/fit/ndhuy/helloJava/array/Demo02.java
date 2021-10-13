package vn.edu.hcmus.fit.ndhuy.helloJava.array;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava.array
 * Created by ndhuy
 * Date 13/10/2021 - 16:17
 * Description: Jagged Array
 */
public class Demo02 {

    /**
     * main funtion
     * @param argv parameter from terminal
     */
    public static void main(String[] argv) {
        int[][] a = inputArray();
        printArray(a);
    }

    /**
     * Init or input Array from terminal
     * @return array[][]
     */
    public static int[][] inputArray() {
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        return array;
    }

    /**
     * print array/matrix
     * @param array integer[][]
     */
    public static void printArray(int[][] array)
    {
        System.out.println();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
