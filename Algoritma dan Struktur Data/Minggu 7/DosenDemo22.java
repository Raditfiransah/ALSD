import java.util.Scanner;
public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen22 listDosen = new DataDosen22();
        Dosen22 dosen1 = new Dosen22("123","Radit",true,38);
        Dosen22 dosen2 = new Dosen22("124","Firansah",false,35);
        Dosen22 dosen3 = new Dosen22("125","Salsa",false,40);
        Dosen22 dosen4 = new Dosen22("126","Alex",true,31);
        Dosen22 dosen5 = new Dosen22("127","Dimas",true,40);
        Dosen22 dosen6 = new Dosen22("128","Radit",true,33);
        Dosen22 dosen7 = new Dosen22("129","Budi",false,39);
        Dosen22 dosen8 = new Dosen22("130","Siti",true,36);
        Dosen22 dosen9 = new Dosen22("131","Rizky",false,37);
        Dosen22 dosen10 = new Dosen22("132","Joko",true,40);


        listDosen.tambah(dosen1);
        listDosen.tambah(dosen2);
        listDosen.tambah(dosen3);
        listDosen.tambah(dosen4);
        listDosen.tambah(dosen5);
        listDosen.tambah(dosen6);
        listDosen.tambah(dosen7);
        listDosen.tambah(dosen8);
        listDosen.tambah(dosen9);
        listDosen.tambah(dosen10);

        System.out.println("Data Dosen Sebelum di Sorting:");

        listDosen.tampil();
        // pencarian data sequential
        System.out.println("====================================");
        System.out.println("Pencarian Data");
        System.out.println("====================================");
        System.out.print("Nama:");
        String cari = input.nextLine();
        System.out.println();
        
        System.out.println("Menggunakan Sequential Searching:");
        System.out.println("====================================");
        listDosen.cariNamaDosen(cari);
        
        System.out.println("====================================");
        System.out.println("Pencarian Data");
        System.out.println("====================================");
        System.out.print("Usia:");
        int usia = input.nextInt();
        System.out.println();
        
        System.out.println("Menggunakan Binary Searching:");
        System.out.println("====================================");
        listDosen.cariUsiaDosen(usia);

        input.close();
    }
}
