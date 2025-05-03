public class StackTugasMahasiswa22 {
    Mahasiswa22[] stack;
    int top;
    int size;

    public StackTugasMahasiswa22(int size) {
        this.size = size;
        stack = new Mahasiswa22[size];
        top = -1;
    }
    
    public boolean isfull() {
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa22 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh!");
        }
    }
    
    public Mahasiswa22 pop() {
        if (!isEmpty()) {
            Mahasiswa22 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong!");
            return null;
        }
    }
    
    public Mahasiswa22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong!");
            return null;
        }
    }

    public Mahasiswa22 pertama() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack Kosong!");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack Kosong!");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas );
            }
        }
        System.out.println();
    }

    public void total() {
        System.out.println("Total Tugas: " + (top + 1));
    }
} 
