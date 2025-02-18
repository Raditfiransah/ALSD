public class Praktikum4 {
    //Variabel Global
    static int[][] stock = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12}, 
        {2, 10, 10, 5},
        {5, 7, 12, 9}    
    };
    static String[] namaBunga = {"Aglomena", "Keladi", "Alocasia", "Mawar"}; 
    static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        pendapatan();
        stok();
    }

    public static void pendapatan(){
        for (int i = 0; i < 4;i++){
            int totalPendapatan = 0;
            for (int j = 0; j < 4; j++){
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Royal garden " + (i+1) + ": " + totalPendapatan);
        }
    }

    public static void stok(){
        int[] totalStok4 = stock[3];
        int[] bungaMati = {-1, -2, -0, -5};
        System.out.println("Total Stok Royal Garden 4");
        for (int i = 0; i < 4;i++){
            System.out.printf("%-10s%-5s\n",namaBunga[i], totalStok4[i]);
        }
        
        System.out.println("Total Stok Royal Garden 4 setelah pengurangan");
        for (int i = 0; i < 4;i++){
            totalStok4[i] += bungaMati[i];
            System.out.printf("%-10s%-5s\n",namaBunga[i], totalStok4[i]);
        }
    }
}
