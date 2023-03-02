public class Queue {
    int size;       //큐 사이즈
    int front;      //데이터가 추출되는 부분
    int rear;       //데이터가 입력되는 부분
    int num;
    int[] arr;      //큐를 구현할 배열 설정

    // 큐가 비었을 때의 예외처리
    public class EmptyQueueException extends RuntimeException{
        public EmptyQueueException() {}
    }
    // 큐가 꽉 찼을 때의 예외처리
    public class FullQueueException extends RuntimeException{
        public FullQueueException() {}
    }
    //생성자 생성할 때 배열의 크기 설정
    public  Queue(int size){
        this.front = this.rear = 0;
        this.arr = new int[size + 1];


    }

    public boolean isEmpty(){
        if (this.front == this.rear){
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if((this.rear + 1) % this.arr.length == this.front){
            return true;
        }
        return false;
    }

    public void enque(int data) throws FullQueueException{
        if (isFull()){
            throw new FullQueueException();
        }
        this.arr[this.rear] = data;
        this.rear = (this.rear+1) % this.arr.length;
    }

    public int deque() throws EmptyQueueException{
        if (isEmpty()){
            throw new EmptyQueueException();
        }
        int data = this.arr[this.front];
        this.front = (this.front+1)% this.arr.length;
        return data;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyQueueException();
        }
        int data = this.arr[this.front];
        return data;
    }

    public void clear(){
        this.front = this.rear = 0;
    }

    public int size(){
        return (this.arr.length + this.rear - this.front) % this.arr.length;
    }

    public void print(){

        int start = this.front;
        int end = this.rear;

        for (int i = start; i <end-1 ; i = (i+1) % this.arr.length) {
            System.out.print(this.arr[i] + ",");
        }
        System.out.println(this.arr[end-1]);
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        System.out.println(queue.isEmpty());
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        queue.enque(5);
        queue.print();
        System.out.println(queue.isFull());
        System.out.println(queue.deque());
        queue.print();
        System.out.println(queue.peek());
        System.out.println(queue.size());


    }
}
