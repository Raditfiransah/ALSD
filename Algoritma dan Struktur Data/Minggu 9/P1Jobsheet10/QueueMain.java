package P1Jobsheet10;
import java.util.Scanner;

public class QueueMain {
    public static void menu (){
        System.out.println("Masukkan operasi yang ingin dilakukan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("4. Exit");
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kapasitas queue");
        int n = input.nextInt();

        Queue q = new Queue(n);
        int pilih = 0;
        do {
            menu();
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int dataMasuk = input.nextInt();
                    q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang keluar: " + dataKeluar);
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
                case 6:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 6);
        input.close();
    }
}
