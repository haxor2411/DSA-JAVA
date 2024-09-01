package Stack;

public class DynamicStack {
    public static class Stack{
        int[] data;
        int tos;

        Stack(int n){
            this.data = new int[n];
            this.tos = -1;
        }
        // change this func acc to the ques
        void push(int val){
            if(this.size() == this.data.length){
                int newData[] = new int[2 * this.data.length];
                for(int i = 0; i < this.data.length; i++) newData[i] = this.data[i];
                this.data = newData;
            }
            this.tos++;
            this.data[this.tos] = val;
        }

        int pop(){
            if(this.tos == -1){
                System.out.print("Stack Underflow ");
                return -1;
            }
            int temp = this.data[tos];
            this.data[tos] = 0;
            this.tos--;
            return temp;
        }

        int size(){
            return this.tos + 1;
        }

        int top(){
            if(this.tos == -1){
                System.out.print("Stack is Empty ");
                return -1;
            }
            return this.data[tos];
        }

        void display(){
            System.out.print("[ ");
            for(int i = this.size() - 1; i >= 0; i--) if(this.data[i] != 0) System.out.print(this.data[i] + " ");
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Stack stack = new Stack(n);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // dynamic
        
        System.out.println(stack.size());

        System.out.println(stack.top());

        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); //underflow

        System.out.println(stack.size());

        System.out.println(stack.top());

        stack.display();
    }
}
