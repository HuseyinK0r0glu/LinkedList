public class ListNode <T>{

    T data;
    ListNode<T> nextNode;

    public ListNode(T object) {
        this(object,null);
    }

    public ListNode(T data, ListNode<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
