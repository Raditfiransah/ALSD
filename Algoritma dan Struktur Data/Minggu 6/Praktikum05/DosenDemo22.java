public class DosenDemo22 {
    public static void main(String[] args) {
        DataDosen22 listDosen = new DataDosen22();
        Dosen22 dosen1 = new Dosen22("123","Radit",true,38);
        Dosen22 dosen2 = new Dosen22("124","Firansah",false,35);
        Dosen22 dosen3 = new Dosen22("125","Salsa",false,40);
        Dosen22 dosen4 = new Dosen22("126","Alex",true,31);
        Dosen22 dosen5 = new Dosen22("127","Dimas",true,43);
        Dosen22 dosen6 = new Dosen22("128","Ukin",true,33);
        Dosen22 dosen7 = new Dosen22("129","Budi",false,39);
        Dosen22 dosen8 = new Dosen22("130","Siti",true,36);
        Dosen22 dosen9 = new Dosen22("131","Rizky",false,37);
        Dosen22 dosen10 = new Dosen22("132","Joko",true,42);


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
        
        System.out.println("Data Usia Dosen Setelah di Sorting (Bubble Sort):");
        listDosen.bubbleSort();
        listDosen.tampil();

        System.out.println("Data Usia Dosen Setelah di Sorting (Insertion Sort):");
        listDosen.insertionSort();
        listDosen.tampil();
    }
}
