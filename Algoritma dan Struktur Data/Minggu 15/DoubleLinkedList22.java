public class DoubleLinkedList22 {
    NodeDLL22 head, tail;
    private int size;

    public DoubleLinkedList22() { 
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(MahasiswaDLL22 data) {
        NodeDLL22 newNode = new NodeDLL22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(MahasiswaDLL22 data) {
        NodeDLL22 newNode = new NodeDLL22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAfter(String key, MahasiswaDLL22 data) {
        NodeDLL22 current = head;

        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } 

        NodeDLL22 newNode = new NodeDLL22(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println(" Linked list masih kosong!");
            return;
        }
        
        NodeDLL22 current = head;
        System.out.println("Isi Linked List:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        } 
        
        System.out.println("Data sudah berhasil dihapus");
        System.out.println("Data yang terhapus adalah:");
        head.data.tampil();
        
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
            return;
        }
        
        System.out.println("Data sudah berhasil dihapus");
        System.out.println("Data yang terhapus adalah:");
        tail.data.tampil();
        
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    
    public void search(String key) {
        NodeDLL22 current = head;
        int index = 0;
        boolean found = false;
        
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(key)) {
                System.out.println("Data ditemukan pada indeks ke-" + index);
                current.data.tampil();
                found = true;
                break;
            }
            current = current.next;
            index++;
        }
        
        if (!found) {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan");
        }
    }

    public void add(int index, MahasiswaDLL22 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas");
            return;
        }
        
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            NodeDLL22 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            
            NodeDLL22 newNode = new NodeDLL22(data);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        NodeDLL22 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Data tidak dapat dihapus");
            return;
        }

        NodeDLL22 temp = current.next;
        System.out.println("Data yang dihapus:");
        temp.data.tampil();

        if (temp == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = temp.next;
            temp.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Penghapusan tidak dapat dilakukan");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            NodeDLL22 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            
            System.out.println("Data yang dihapus:");
            current.data.tampil();
            
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public MahasiswaDLL22 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return null;
        }
        return head.data;
    }

    public MahasiswaDLL22 getLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return null;
        }
        return tail.data;
    }

    public MahasiswaDLL22 getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid");
            return null;
        }

        NodeDLL22 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }
}
