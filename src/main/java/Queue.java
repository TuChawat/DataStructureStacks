public class Queue {
    private final MyLinkedList myLinkedList;

    public Queue(){
        this.myLinkedList = new MyLinkedList();
    }


    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue(){
        myLinkedList.printMyNodes();
    }

    public INode peak(){
        return myLinkedList.head;
    }

    public INode dequeue() {
        return myLinkedList.pop();
    }
}
