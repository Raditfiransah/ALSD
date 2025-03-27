public class MainSorting22 {
    public static void main(String[] args) {
        int[] a = {20,10,2,7,12};
        int[] b = {30,20,2,8,14};
        int[] c = {40,10,4,9,3};
        Sorting22 dataUrut1 = new Sorting22(a,a.length);
        Sorting22 dataUrut2 = new Sorting22(b,b.length);
        Sorting22 dataUrut3 = new Sorting22(c,c.length);

        System.out.println("Data Awal 1:");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data Setelah Bubble Sorting :");
        dataUrut1.tampil();

        System.out.println("===================================");
        
        System.out.println("Data Awal 2:");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("Data Setelah Selection Sorting :");
        dataUrut2.tampil();

        System.out.println("===================================");
        
        System.out.println("Data Awal 2:");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data Setelah Insertion Sorting :");
        dataUrut3.tampil();


    }
}
