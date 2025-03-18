public class Mahasiswa {
    int tertinggi(int[] nilai, int l, int r){
        if (l == r){
            return nilai[l];
        }

        int mid = (l+r) / 2;
        int ltertinggi = tertinggi(nilai,l,mid);
        int rtertinggi = tertinggi(nilai,mid+1,r);

        if (ltertinggi > rtertinggi){
            return ltertinggi;
        }else {
            return rtertinggi;
        }
    }
    int terendah(int[] nilai, int l, int r){
        if (l == r){
            return nilai[l];
        }

        int mid = (l+r) / 2;
        int lterendah = terendah(nilai,l,mid);
        int rterendah = terendah(nilai,mid+1,r);

        if (lterendah < rterendah){
            return lterendah;
        }else {
            return rterendah;
        }
    }

    double rataRata(int[] nilai){
        int total = 0;
        for (int nil : nilai){
            total += nil; 
        }
        return total / nilai.length;
    }
}
