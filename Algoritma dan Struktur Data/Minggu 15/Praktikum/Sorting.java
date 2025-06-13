import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        
        ArrayList<String> daftarSiswa = new ArrayList<>();
    
        daftarSiswa.add("Drake");
        daftarSiswa.add("Carti");
        daftarSiswa.add("Kendrick");
        Collections.sort(daftarSiswa);

        System.out.println("Daftar siswa setelah diurutkan:");
        System.out.println(daftarSiswa);
    }
}
