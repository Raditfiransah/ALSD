public class StackKonversi22 {
    int[] tumpukanBiner;
    int top;
    int size;

    public StackKonversi22() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isfull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (!isfull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack Penuh!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int biner = tumpukanBiner[top];
            top--;
            return biner;
        } else {
            System.out.println("Stack Kosong!");
            return -1; 
        }
    }

}
