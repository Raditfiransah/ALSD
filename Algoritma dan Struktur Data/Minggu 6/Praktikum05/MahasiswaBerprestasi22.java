public class MahasiswaBerprestasi22 {
    Mahasiswa22 mhs[];
    int idx,jumMhs;

    MahasiswaBerprestasi22(int jumMhs){
        this.mhs = new Mahasiswa22[jumMhs];
    }
    void tambah (Mahasiswa22 m){
        if (idx < mhs.length){
            mhs[idx] = m;
            idx++;
        }else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil (){
        for (Mahasiswa22  m : mhs ){
            m.tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < mhs.length - 1; i++){
            for (int j = 1; j < mhs.length - i; j++){
                if (mhs[j].ipk > mhs[j - 1].ipk){
                    Mahasiswa22 temp = mhs[j];
                    mhs[j] = mhs[j - 1];
                    mhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < mhs.length - 1; i++){
            int idxmin = i;
            for (int j = i + 1; j < mhs.length; j++){
                if (mhs[j].ipk < mhs[idxmin].ipk){
                    idxmin = j;
                }
            }
            Mahasiswa22 temp = mhs[idxmin];
            mhs[idxmin] = mhs[i];
            mhs[i] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < mhs.length;i++){
            Mahasiswa22 temp = mhs[i];
            int j = i;
            while(j > 0 && mhs[j-1].ipk < temp.ipk){
                mhs[j] = mhs[j-1];
                j--;
            }
            mhs[j] = temp;
        }
    }
}
