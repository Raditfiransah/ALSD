public class DataDosen22 {
    Dosen22[] listDosen = new Dosen22[10];
    int idx;
    
    void tambah(Dosen22 dosen){
        if(idx < listDosen.length){
            listDosen[idx] = dosen;
            idx++;
        } else {
            System.out.println("Data Dosen penuh");
        }
    }

    void tampil(){
        for(int i = 0; i < idx; i++){
            System.out.println("Data Dosen ke-" + (i+1) + ":");
            listDosen[i].tampilkanInformasi();
            System.out.println("====================================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listDosen.length - 1; i++){
            for (int j = 1; j < listDosen.length - i; j++){
                if (listDosen[j].usia < listDosen[j - 1].usia){
                    Dosen22 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;
                }
            }
        }
    }

    void insertionSort(){
        for (int i = 1; i < listDosen.length;i++){
            Dosen22 temp = listDosen[i];
            int j = i;
            while(j > 0 && listDosen[j-1].usia < temp.usia){
                listDosen[j] = listDosen[j-1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}
