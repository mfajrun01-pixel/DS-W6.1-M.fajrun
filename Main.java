import java.util.LinkedList;    
import java.util.Queue;

public class Main {
    
    static class queue1 {
        private  Queue<Integer> queue;

        public queue1() {
            this.queue = new LinkedList<>();
        }
        
        public void enqueue(int age) {
            queue.add(age);
        }
        
        public int dequeue() {
            return queue.remove();
        }
        
        public boolean isEmpty() {
            return queue.isEmpty();
        }
        
        public void printQueue() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            
            while (!this.isEmpty()) {
                sb.append(this.dequeue()); 

                if (!this.isEmpty()) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        String input1 = "39 538 39 55 12 28 49 430";
        System.out.println("Case 1:");
        queue1(input1);

        String input2 = "29 48 52 28 27 104 58 395 57";
        System.out.println("Case 2:");
        queue1(input2);
    }
    public static void queue1(String input) {
        queue1 passedque = new queue1();
        queue1 rejectedque = new queue1();

        String[] agesStrings = input.split(" ");
        for (String ageStr : agesStrings) {
            int age = Integer.parseInt(ageStr);
            if (age >= 28 && age <= 118) {
                passedque.enqueue(age);
            } else {
                rejectedque.enqueue(age);
            }
        }
        passedque.printQueue();
        rejectedque.printQueue();
    }
}
