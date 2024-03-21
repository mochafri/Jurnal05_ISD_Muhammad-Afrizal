import java.util.*;

public class QueueLL<E> {

    private Queue<E> queueList;

    // Constructor
    public QueueLL() {
        queueList = new LinkedList<E>();
    }

    // Tambah data
    public void addData(E object) {
        queueList.add(object);
    }

    // Hapus data
    public E removeData() throws NoSuchElementException {
        return queueList.remove();
    }

    // Jika queue kosong
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // output
    public void tampilkanQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()){
            Object value = iterator.next();
            System.out.println(value + " ");
        } {
            
        }
    }
}