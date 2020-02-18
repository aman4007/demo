package hackerrank;

import java.util.Arrays;


public class CircularQueue<E> {
	private int currentSize;
	private E[] circularQueueElements;
	private int maxSize; // Circular Queue maximum size

	private int rear;// rear position of Circular queue(new element enqueued at rear).
	private int front; // front position of Circular queue(element will be dequeued from front).

	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		currentSize = 0;
		front = -1;
		rear = -1;
		circularQueueElements = (E[]) new Object[this.maxSize];
		
	}
	
	

	
	
	
	 public boolean isFull() {
	        return (currentSize == circularQueueElements.length);
	    }

	    public boolean isEmpty() {
	        return (currentSize == 0);
	    }

	

	public void enque(E item) throws QueueException {
		if (isFull()) {
            throw new QueueException("Queue is Full");
		
		} else {
			rear = (rear + 1) % circularQueueElements.length;
			circularQueueElements[rear] = item;
			currentSize++;
			if (front == -1) {
				front = rear;
			}

		}
	}
	
	public E deque()throws QueueException {
		 E deQueuedElement;
		if(isEmpty()) {
            throw new QueueException("Circular Queue is empty. Element cannot be retrieved");

		}
		else {
			deQueuedElement=circularQueueElements[front];
			circularQueueElements[front]=null;
			front=(front+1)%circularQueueElements.length;
			currentSize--;
			
		}
		return deQueuedElement;
	}
	   @Override
	    public String toString() {
	        return "CircularQueue [" + Arrays.toString(circularQueueElements) + "]";
	    }
	   
	  
	public static void main(String arg[]) throws Exception{
		CircularQueue<Integer> c=new CircularQueue<Integer>(3);
		c.enque(4);
		c.enque(4);
		c.enque(4);
		System.out.println(c);
		c.deque();
		c.enque(5);
		System.out.println(c);
		
	}

}
