package practice_day14;

public class myNode<K> {

    private K key;
    private int next;

    public myNode(K key) {
        this.key = key;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
