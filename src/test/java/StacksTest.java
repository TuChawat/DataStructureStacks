import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StacksTest {
    @Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        Stack myStack = new Stack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, peak);
    }

    @Test
    public void given3NumbersInStack_WhenPoped_ShouldMatchWithLastAddedNode() {
        Stack myStack = new Stack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, pop);
    }
}
