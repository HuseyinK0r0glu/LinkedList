public class List <T>{

    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private final String name;

    public List() {
        this("list");
    }

    public List(String name) {
        this.name = name;
        firstNode = lastNode = null;
    }

    public void insertAtFront(T insertItem){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItem);
        }else{
            firstNode = new ListNode<>(insertItem,firstNode);
        }
    }

    public void insertAtBack(T insertItem){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItem);
        }else{
            lastNode = lastNode.nextNode = new ListNode<>(insertItem);
        }
    }

    public T removeFromFront(){
        if(isEmpty()){
            throw new EmptyListExc();
        }

        T data = firstNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            firstNode = firstNode.nextNode;
        }

        return data;
    }

    public T removeFromBack(){
        if(isEmpty()){
            throw new EmptyListExc();
        }

        T data = lastNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            ListNode<T> current = firstNode;

            while(current.nextNode != lastNode){
                current = current.nextNode;
            }

            current.nextNode = null;
            lastNode = current;
        }
        return data;
    }


    public void print(){
        if(isEmpty()){
            throw new EmptyListExc();
        }
        System.out.printf("This %s is:",name);

        ListNode<T> current = firstNode;

        while(current != null){
            System.out.printf("%s",current.data);
            System.out.print(" ");
            current = current.nextNode;
        }

        System.out.println();
    }

    public boolean isEmpty(){
        return firstNode == null;
    }
}
