import java.util.Scanner;

public class MainPangkat {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        Pangkat[] png = new Pangkat[n];

        for (int i = 0; i < n; i++){
            System.out.println("Masukkan nilai basis Elemen ke " + (i + 1)  + ": ");
            int basis = input.nextInt();
            System.out.println("Masukkan nilai pangkat Elemen ke " + (i + 1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BF");
        for (Pangkat p : png) {
            System.out.println(p.nilai+" Pangkat "+ p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("Hasil Pangkat DC");
        for (Pangkat p : png) {
            System.out.println(p.nilai+" Pangkat "+ p.pangkat + ": " + p.pangkatDC(p.nilai,p.pangkat));
        }
        input.close();
    }
}
