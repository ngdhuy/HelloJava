package vn.edu.hcmus.fit.ndhuy.helloJava.MyNumber;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava.MyNumber
 * Created by ndhuy
 * Date 13/10/2021 - 16:36
 * Description: define class Phan So
 */

public class PhanSo {
    // Attributes
    private int tu;
    private int mau;

    // Methods
    // Constructors

    /**
     * Default constructor
     */
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    /**
     * Constructor with parameters
     * @param tu integer
     * @param mau integer
     */
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    /**
     * Constructor copy
     * @param pt Phan So duoc sao chep
     */
    public PhanSo(PhanSo pt) {
        this.tu = pt.tu;
        this.mau = pt.mau;
    }

    // Getters and Setters

    /**
     * getter of Tu So
     * @return Tu so
     */
    public int getTu() {
        return tu;
    }

    /**
     * Setter of Mau So
     * @param tu Tu So
     */
    public void setTu(int tu) {
        this.tu = tu;
    }

    /**
     * Getter Mau So
     * @return Mau So
     */
    public int getMau() {
        return mau;
    }

    /**
     * Setter Mau Sao
     * @param mau Mau So
     */
    public void setMau(int mau) {
        this.mau = mau;
    }

    /**
     * Return String format of object
     * @return String
     */
    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }

    /**
     * Static function to convert String to PhanSo object
     * @param str String
     * @return PhanSo Object
     */
    public static PhanSo parsePhanSo(String str) {
        String[] arrStr = str.split("/");
        int tu = Integer.parseInt(arrStr[0]);
        int mau = Integer.parseInt(arrStr[1]);
        PhanSo pt = new PhanSo(tu, mau);
        return pt;
    }
}
