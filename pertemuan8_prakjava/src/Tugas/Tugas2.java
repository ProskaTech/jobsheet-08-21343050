package Tugas;

//Created by 21343050_Heri Ramadhan

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
        int no[] = new int[11];
        int max;        

        for (int i = 1; i < no.length; i++) {
            String Kato = "Masukkan Angka ke-"+ i +": ";
            String Angko = JOptionPane.showInputDialog(Kato);
            no[i] = Integer.parseInt(Angko);
            System.out.println(no[i]);
            }

            max = no[0];
            
            for (int i = 1; i < no.length; i++) {
                if (no[i] > max) {
                max = no[i];
                }
            }

            String msg = "Angka Terbesarnya adalah: "+max;
            System.out.println(msg);
            JOptionPane.showMessageDialog(null, msg);
    }
}
