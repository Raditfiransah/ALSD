public class LinkedList {
    NodePelayanan head;
    NodePelayanan tail;
    int size;

    public boolean isEmpty(){
        return (head == null);
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){
        head = tail = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()) {
            NodePelayanan temp = head;
            System.out.println("Isi Linked List:\t");
            while (temp != null) {
                temp.data.tampilkanInformasi();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa input){
        NodePelayanan ndInput = new NodePelayanan(input, null);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
        size++;
    }

    public void addLast(Mahasiswa input){
        NodePelayanan ndInput = new NodePelayanan(input, null);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public void insertAfter(String key, Mahasiswa input){
        NodePelayanan ndInput = new NodePelayanan(input, null);
        NodePelayanan temp = head;

        do {
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
        size++;
    }

    public void insertAt(int index, Mahasiswa input){
        if (index < 0) {
            System.out.println("Index salah");
            return;
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodePelayanan temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodePelayanan(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
        size++;
    }

    public void getData(int index){
        if (index < 0 || index >= size) {
            System.out.println("Index diluar batas");
            
        }
    }
        
    public int indexOf(String key){
        NodePelayanan temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)){
            temp = temp.next;
            index++;
        }
        if (temp == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked List Kosong, tidak dapat dihapus! ");
        } else if (head == tail){
            head = tail = null; 
        } else {
            head = head.next;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List Kosong, tidak dapat dihapus! ");
        } else if (head == tail){
            head = tail = null;
        } else {
            NodePelayanan temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    public void remove(String key){
        if (isEmpty()){
            System.out.println("Linked List Kosong, tidak dapat dihapus! ");
        } else {
            NodePelayanan temp = head;
            while (temp != null){
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
        size--;
    }

    public void removeAt(int index){
        if (index == 0){
            this.removeFirst();
        } else {
            NodePelayanan temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
        size--;
    }

    public int jumlahAntrian(){
        return size;
    }
}