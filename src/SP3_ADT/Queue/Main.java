package SP3_ADT.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // A queue operates after the principle of first in last out
        // We will take a look at some of the queues methods

        // We initiate a queue which takes integers as datatype
        Queue<Integer> queue = new LinkedList<>();

        // We populate the queue with a for-loop
        for(int x=1; x<11; x++){
            queue.add(x);
        }

        // We print the queue
        System.out.println("The queue consists of: " + queue + "\n");

        // We check whats on the head of the queue
        System.out.println("The top element of the queue has the value: " + queue.peek() + "\n");


        // The method poll deletes and returns the head of the queue. Throws NoSuchElementException if queue is empty
        System.out.println("We remove the head with the value of: " + queue.remove() + "\n");
        System.out.println("We remove the head with the value of: " + queue.remove() + "\n");

        // We check the head of the queue
        System.out.println("The head of the queue has the value of: " + queue.peek() + "\n");

        // We check the size of the queue
        System.out.println("The queue has the size of: " + queue.size() + "\n");

        // We initiate a  new queue which takes integers as datatype
        Queue<Integer> secondQueue = new LinkedList<>();

        // The method poll deletes and returns the head of the queue. Returns null if queue is empty
        System.out.println("We remove the head with the value of: " + secondQueue.poll() + "\n");

        // The method poll deletes and returns the head of the queue. Throws NoSuchElementException if queue is empty
        System.out.println("We remove the head with the value of: " + secondQueue.remove() + "\n");
    }
}
