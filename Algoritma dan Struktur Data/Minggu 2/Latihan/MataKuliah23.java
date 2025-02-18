public class MataKuliah23 {
    String kodemk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: "+ kodemk);
        System.out.println("Nama Mata Kuliah: "+ nama);
        System.out.println("Jumlah SKS: "+ sks);
        System.out.println("Jumlah Jam: "+ jumlahJam);
    }

    void ubahSks(int sksbaru){
        sks = sksbaru;
    }

    void tambahJam(int jamTambahan){
        jumlahJam +=jamTambahan;
    }

    void kurangiJam(int kurangiJam){
        if(jumlahJam >= kurangiJam){
            jumlahJam -= kurangiJam;
        }else {
            System.out.println("jumlah jam tidak mencukupi");
        }
    }

    public MataKuliah23(){}
    public MataKuliah23(String mk, String nm, int sks, int jumjam){
        kodemk = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jumjam;
    }
}

