import java.util.ArrayList;

/*
* ArrayList를 이용하여 Stack 구현하기!
*
 */
class Stack{
    ArrayList list = new ArrayList();
    int top = -1;

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    public void push(int data){
        top = top + 1;
        this.list.add(this.top, data);
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Empty!!");
        }
        int data = (int) this.list.remove(top);
        top = top -1;
        return data;
    }

    public void printStack(){
        System.out.println(list);
    }
    Stack() {}

}

public class PracticeStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();

        System.out.println(stack.pop());
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }

}
