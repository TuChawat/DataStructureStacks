public class Stack {

    private final MyLinkedList myLinkedList;

    public Stack(){
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack(){
        myLinkedList.printMyNodes();
    }

    public INode peak(){
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }
}

