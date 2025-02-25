package Dosen;
import java.util.Scanner;
public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = input.nextInt();

        Dosen22[] arrayOfDosen = new Dosen22[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++){
            arrayOfDosen[i] = new Dosen22();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].inputDataDosen();
        }   

        for (Dosen22 dosen : arrayOfDosen){
            dosen.cetakInfo();
        }

        DataDosen22.dataSemuaDosen(arrayOfDosen);
        DataDosen22.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen22.rataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen22.infoDosenPalingTua(arrayOfDosen);
        DataDosen22.infoDosenPalingMuda(arrayOfDosen);
    }
}
