import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Nilai Faktorial : "+n+" Menggunakan BF : "+ fk.faktorialBF(n));
        System.out.println("Nilai Faktorial : "+n+" Menggunakan DC : "+ fk.faktorialDC(n));

        input.close();
    }
}
