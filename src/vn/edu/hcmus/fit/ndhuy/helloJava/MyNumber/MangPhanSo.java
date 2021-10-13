package vn.edu.hcmus.fit.ndhuy.helloJava.MyNumber;

/**
 * vn.edu.hcmus.fit.ndhuy.helloJava.MyNumber
 * Created by ndhuy
 * Date 13/10/2021 - 16:54
 * Description: Mang Phan So
 */
public class MangPhanSo {
    private PhanSo[] arrPhanSo;

    /**
     * Default constructor
     */
    public MangPhanSo() {
        this.arrPhanSo = null;
    }

    /**
     * Constructor with parameters
     * @param arr Mang Phan So
     */
    public MangPhanSo(PhanSo... arr) {
        this.arrPhanSo = new PhanSo[arr.length];
        for(int i = 0; i < arr.length; i++)
            this.arrPhanSo[i] = new PhanSo(arr[i]);
    }

    /**
     * Getter Mang Phan So
     * @return PhanSo[]
     */
    public PhanSo[] getArrPhanSo() {
        return arrPhanSo;
    }

    /**
     * Setter Mang Phan So
     * @param arrPhanSo PhanSo[]
     */
    public void setArrPhanSo(PhanSo[] arrPhanSo) {
        this.arrPhanSo = arrPhanSo;
    }

    /**
     * Convert list objects to String
     * @return To String
     */
    @Override
    public String toString() {
        if(this.arrPhanSo == null)
            return "Mang rong";
        else {
            String s = "";
            for(PhanSo pt : this.arrPhanSo) {
                s += pt.toString() + " ";
            }
            return s;
        }
    }

    /**
     * Static function to convert String to Array PhanSo
     * @param str Array PhanSo
     * @return MangPhanSo object
     */
    public static MangPhanSo parseMangPhanSo(String str){
        MangPhanSo arr = new MangPhanSo();
        String[] arrStr = str.split(" ");
        arr.arrPhanSo = new PhanSo[arrStr.length];
        for(int i = 0; i <arrStr.length; i++)
            arr.arrPhanSo[i] = PhanSo.parsePhanSo(arrStr[i]);
        return arr;
    }
}
