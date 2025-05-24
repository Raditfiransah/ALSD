package Tugas;

public class QueueKRS {
    Mahasiswa[] data;
    int front, rear, size, max, jumlahSudahKrs;

    public QueueKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahSudahKrs = 0;
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

    public void kosongkanAntrian(){
        if (isEmpty()){
            System.out.println("Queue masih kosong!!");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan!!");
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

    public Mahasiswa[] prosesKrs() {
        if (size < 2) {
            System.out.println("Antrian kurang dari dua, tidak bisa memproses dua data!");
            return null;
        }
        Mahasiswa[] result = new Mahasiswa[2];
        for (int i = 0; i < 2; i++) {
            result[i] = data[front];
            front = (front + 1) % max;
            size--;
            jumlahSudahKrs++;
        }
        return result;
    }

    public void lihatSemua() {
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

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else if (size == 1) {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
        } else {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
            int index = (front + 1) % max;
            data[index].tampilkanData();
        }
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

    public int jumlahAntrian() {
        return size;
    }   

    public int jumlahSudahKrs() {
        return jumlahSudahKrs;
    }

    public int jumlahBelumKrs(){
        return size;
    }
}
