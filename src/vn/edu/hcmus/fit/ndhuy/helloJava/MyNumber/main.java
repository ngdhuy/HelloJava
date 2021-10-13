package vn.edu.hcmus.fit.ndhuy.helloJava.MyNumber;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava.MyNumber
 * Created by ndhuy
 * Date 13/10/2021 - 16:45
 * Description: main class
 */
public class main {
    /**
     * main function
     * @param argv parameter for terminal
     */
    public static void main(String[] argv) {
        PhanSo pt_1 = new PhanSo(1, 2);
        System.out.println(pt_1);

        MangPhanSo arr = new MangPhanSo(
                new PhanSo(1, 2),
                new PhanSo(2, 3),
                new PhanSo(4, 5)
        );

        System.out.println(arr);
        String str = "5/6 7/2 8/4 9/5";

        MangPhanSo arrPhanSo = MangPhanSo.parseMangPhanSo(str);
        System.out.println(arrPhanSo);
    }
}
