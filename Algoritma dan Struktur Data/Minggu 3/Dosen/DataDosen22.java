package Dosen;

public class DataDosen22 {

    public static void dataSemuaDosen(Dosen22[] arrayOfDosen){
        for (Dosen22 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen22[] arrayOfDosen){
        int laki = 0, perempuan = 0;

        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.kelamin.equalsIgnoreCase("laki laki")) {
                laki++;
            } else if(dosen.kelamin.equalsIgnoreCase("perempuan")){
                perempuan++;
            }
        }

        System.out.printf("\nJumlah Dosen Per Jenis Kelamin:\n");
        System.out.printf("Laki-Laki\t: %d\n", laki);
        System.out.printf("Perempuan\t: %d\n", perempuan);
    }

    public static void rataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen){
        int jumUsiaLaki = 0, jumUsiaPerempuan = 0;
        int jumLaki = 0, jumPerempuan = 0;
        
        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.kelamin.equalsIgnoreCase("laki laki")) {
                jumLaki++;
                jumUsiaLaki += dosen.usia;
            } else if(dosen.kelamin.equalsIgnoreCase("perempuan")){
                jumPerempuan++;
                jumUsiaPerempuan += dosen.usia;
            }
            
        }
        
        double rataUsiaLaki = jumUsiaLaki / jumLaki;   
        double rataUsiaPerempuan = jumUsiaPerempuan / jumPerempuan;

        System.out.printf("\nRata-Rata Usia Dosen Per Jenis Kelamin:\n");
        System.out.printf("Laki-Laki\t: %.2f\n", rataUsiaLaki);
        System.out.printf("Perempuan\t: %.2f\n", rataUsiaPerempuan);
    }

    public static void infoDosenPalingTua(Dosen22[] arrayOfDosen){
        Dosen22 dosenTertua = arrayOfDosen[0];
        for (Dosen22 dosen : arrayOfDosen){
            if(dosen.usia > dosenTertua.usia){
                dosenTertua = dosen;
            }
        }
        System.out.printf("\nDosen Paling Tua:\n");
        dosenTertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen22[] arrayOfDosen){
        Dosen22 dosenTermuda = arrayOfDosen[0];
        for (Dosen22 dosen : arrayOfDosen){
            if(dosen.usia < dosenTermuda.usia){
                dosenTermuda = dosen;
            }
        }
        System.out.printf("\nDosen Paling Muda:\n");
        dosenTermuda.cetakInfo();
    }
}
