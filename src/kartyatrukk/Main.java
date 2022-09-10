package kartyatrukk;

public class Main {

    public static String[] pakli = {"P_ÁSZ", "P_KIR", "P_FEL", "P_X", "P_IX",
        "P_VIII", "T_ÁSZ", "T_KIR", "T_FEL", "T_X", "T_IX", "T_VIII", "Z_ÁSZ", "Z_KIR",
        "Z_FEL", "Z_X", "Z_IX", "Z_VIII", "M_ÁSZ", "M_KIR", "M_FEL"};
    public static String[] sor1 = new String[7];
    public static String[] sor3 = new String[7];
    public static String[] sor2 = new String[7];

    public static void main(String[] args) {
        feltolt();
        sorokKirak();
        melyik();
        kever();
        valasztottLap();

    }

    public static void feltolt() {
        int index = 0;
        while (index < pakli.length) {
            for (int i = 0; i < sor1.length; i++) {
                sor1[i] = pakli[index];
                index++;
            }

            for (int i = 0; i < sor2.length; i++) {
                sor2[i] = pakli[index];
                index++;
            }

            for (int i = 0; i < sor3.length; i++) {
                sor3[i] = pakli[index];
                index++;
            }

        }

    }

    public static void sorokKirak() {
        System.out.print("1. sor: ");
        for (String sor : sor1) {
            System.out.print(sor + "    ");
        }
        System.out.println("");
        System.out.print("2. sor: ");
        for (String sor : sor2) {
            System.out.print(sor + "    ");
        }
        System.out.println("");
        System.out.print("3. sor: ");
        for (String sor : sor3) {
            System.out.print(sor + "    ");
        }
        System.out.println("");

    }

    public static void kever() {

    }

    private static void melyik() {

    }

    private static void valasztottLap() {

    }

}
