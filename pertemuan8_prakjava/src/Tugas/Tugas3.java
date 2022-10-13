package Tugas;

//Created by 21343050_Heri Ramadhan

public class Tugas3 {
    public static void main(String[] args) {
        String entry[][] = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };

        for (int i = 0; i < entry.length; i++) {
            for (int j = 0; j < entry.length; j++) {
                if (j == 0) {
                    System.out.print("Name\t: ");
                } else if (j == 1) {
                    System.out.print("Tel. #\t: ");
                } else {
                    System.out.print("Address\t: ");
                }
                System.out.println(entry[i][j]);
            }
            System.out.println("");
        }
    }
}
