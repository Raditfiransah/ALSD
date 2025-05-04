public class StackSurat22 {
    private Surat22[] stack;
    private int top;
    private int maxSize;

    public StackSurat22(int size) {
        this.maxSize = size;
        this.stack = new Surat22[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(Surat22 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack Penuh " + surat.namaMahasiswa);
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack Kosong.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public void cariSurat(String cari){
        boolean found = false;
        for (int j = 0; j <= top; j++){
            if (stack[j].namaMahasiswa.equalsIgnoreCase(cari)){
                found = true;
                System.out.println("ID\tNama\tKelas\tIzin\tDurasi");
                System.out.println("=======================================");
                System.out.println(stack[j].idSurat + "\t" + stack[j].namaMahasiswa + "\t" + stack[j].kelas + "\t" + stack[j].jenisIzin + "\t" + stack[j].durasi + " hari");
            }
        }
        if (!found) {
            System.out.println("Surat dengan ID " + cari + " tidak ditemukan.");
        }
    }
}
