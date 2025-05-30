package P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

        public boolean isEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Berhasil ditambahkan ke antrian.");
    }

    public Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSmeua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }   

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("Mahasiswa di belakang: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[rear].tampilkanData();
        }
    }
    
    
}
