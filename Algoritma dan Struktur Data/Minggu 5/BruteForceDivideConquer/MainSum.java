import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah element: ");
        int element = input.nextInt();

        Sum sm = new Sum(element);
        
        for (int i = 0; i <element;i++){
            System.out.println("Masukkan Keuntungan ke-"+ (i+1) +": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Jumlah Keuntungan BF: " + sm.totalBF());
        System.out.println("Jumlah Keuntungan DC: " + sm.totalDC(sm.keuntungan,0,element-1));

        input.close();
    }
}
