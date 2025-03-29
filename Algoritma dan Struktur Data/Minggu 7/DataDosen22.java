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

    void cariNamaDosen(String cari){
        boolean found = false;
        for (int j = 0; j < listDosen.length; j++){
            if (listDosen[j].nama.equals(cari)){
                found = true;
                System.out.println("Dosen ditemukan di indeks " + j + ":");
                listDosen[j].tampilkanInformasi();
            }
        }
        if (!found) {
            System.out.println("Dosen dengan nama " + cari + " tidak ditemukan.");
        }
    }

    void cariUsiaDosen(int cari){
        insertionSort();

        int mid, left = 0, right = idx -1;
        int totalUsia = -1;

        while (right>=left){
            mid = (left + right)/2;
            if (listDosen[mid].usia == cari){
                totalUsia = mid;
                break;
            }else if(listDosen[mid].usia<cari){
                right = mid - 1;;
            }else{
                left = mid + 1;
            }
        }
        if(totalUsia == -1){
            System.out.println("Dosen dengan usia " + cari + " tidak ditemukan.");
        }

        int total = 0;
        int i = totalUsia;

        while (i >= 0 && listDosen[i].usia == cari) {
            listDosen[i].tampilkanInformasi();
            i--;
            total++;
        }

        i = totalUsia + 1;
        while (i < idx && listDosen[i].usia == cari) {
            listDosen[i].tampilkanInformasi();
            i++;
            total++;
        }

        if (total > 1) {
            System.out.println("Peringatan: Ada " + total + " dosen dengan usia " + cari + "!");
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
