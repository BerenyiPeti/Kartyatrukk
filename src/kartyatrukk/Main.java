package kartyatrukk;

import java.util.Scanner;

public class Main {

    public static String[] pakli = {"P_ÁSZ", "P_KIR", "P_FEL", "P_X", "P_IX",
        "P_VIII", "T_ÁSZ", "T_KIR", "T_FEL", "T_X", "T_IX", "T_VIII", "Z_ÁSZ", "Z_KIR",
        "Z_FEL", "Z_X", "Z_IX", "Z_VIII", "M_ÁSZ", "M_KIR", "M_FEL"};
    public static String[] sor1 = new String[7];
    public static String[] sor3 = new String[7];
    public static String[] sor2 = new String[7];
    public static String[] tempPakli = new String[21];

    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            sorokKirak();
            kever();
            System.out.println("Pillanat, a gép kever...");
        }
        
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

    private static int melyik() {
        Scanner beker = new Scanner(System.in);
        System.out.print("Melyik sorban van a választott lap? ");
        return beker.nextInt();

    }
    
    public static void kever() {
        int melyik = melyik();
        
        String[] valSor;
        String[] nemValSor = new String[14];
        switch (melyik) {
            case 1:
                valSor = sor1;
                break;
            case 2:
                valSor = sor2;
                break;
            default:
                valSor = sor3;
                break;
        }
        
        int tempSorIndex = 0;
        
        for (int i = 0; i < pakli.length; i++) {
            int index = 0;
            
            while (index < valSor.length && pakli[i] != valSor[index]) {
                index++;
            }
           
            boolean benneVan = index < valSor.length;
            
            if (!benneVan) {
                nemValSor[tempSorIndex] = pakli[i];
                tempSorIndex ++;
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < 7; i++) {
           tempPakli[i] = nemValSor[i];
        }
        for (int i = 0; i < 7; i++) {
           tempPakli[i+7] = valSor[i];
        }
        for (int i = 0; i < 7; i++) {
           tempPakli[i+14] = nemValSor[i+7];
        }
        
        /*System.out.print("tempPakli: ");
        for (String sor : tempPakli) {
            System.out.print(sor + ", ");
        }
        System.out.println("");*/
        
        
        int index = 0;
        for (int i = 0; i < tempPakli.length && index < sor1.length; i+= 3) {
            sor1[index] = tempPakli[i];
            sor2[index] = tempPakli[i + 1];
            sor3[index] = tempPakli[i + 2];
            index++;
            
        }
        
        //teszt();
        
        
    }

    private static void valasztottLap() {
        System.out.println("A választott kártyád, a " + tempPakli[10]);
    }
    
   private static void teszt() {
       
        
        System.out.print("sor1: ");
        for (String sor : sor1) {
            System.out.print(sor + "    ");
        }
        System.out.println("");
        System.out.print("sor2: ");
        for (String sor : sor2) {
            System.out.print(sor + "    ");
        }
        System.out.println("");
        System.out.print("sor3: ");
        for (String sor : sor3) {
            System.out.print(sor + "    ");
        }
        System.out.println("");
   }

}
