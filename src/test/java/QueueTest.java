import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    public void given3Integers_WhenAddedToQueue_ShouldPassTheTest(){
        Queue myQueue = new Queue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode peak = myQueue.peak();
        myQueue.printQueue();
        Assertions.assertEquals(peak, myFirstNode);
    }

    @Test
    public void given3IntegersInQueue_WhenDequeue_ShouldHaveFirstAddedNode(){
        Queue myQueue = new Queue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode dequeue = myQueue.dequeue();
        myQueue.printQueue();
        Assertions.assertEquals(dequeue, myFirstNode);
    }
}
