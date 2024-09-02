package Queue;

public class NormalQueue {
    public static class Queue{
        int[] data;
        int front;
        int size;

        Queue(int cap){
            this.data = new int[cap];
            this.front = 0;
            this.size = 0;
        }

        int size(){return this.size;}

        void display(){
            if(this.size() == 0){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i = 0; i < this.size(); i++){
                System.out.print(this.data[(this.front + i) % this.data.length] + " ");
            }
            System.out.println();
        }
        
        void add(int val){
            if(this.size() == this.data.length) System.out.println("Queue is full");
            else{
                int idx = (this.size + this.front) % this.data.length;
                this.data[idx] = val;
                size++; 
            }
        }

        int remove(){
            if(this.size == 0){
                System.out.print("Queue is Empty ");
                return -1;
            }
            int val = this.data[this.front];
            this.front = (this.front + 1) % this.data.length;
            this.size--;
            return val;
        }

        int peek(){
            if(this.size() == 0) return -1;
            return this.data[this.front];
        }
    } 
    
    public static void main(String[] args) {
        int n = 5;
        Queue queue = new Queue(n);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60); // Queue is full

        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.size());
        
        System.out.println(queue.remove());
        queue.add(70);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove()); // Queue is Empty

        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
