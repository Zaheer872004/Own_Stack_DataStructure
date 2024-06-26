public class CustomeStack {
    public int[] data;

    private static final int default_value = 5;

    public CustomeStack(){
        this(default_value);
    }

    public CustomeStack(int size){
        this.data = new int[size];
    }

    private int ptr = -1;
    public int push(int item) throws Exception{
        if(isFull()){
            System.out.println("Stack overflow or Full");
            throw new Exception("Stack is full");
        }
        ptr++;
        data[ptr] = item;
        return item;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            System.out.println("Stack is empty || underflow");
            throw new Exception("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            System.out.println("Stack is empty || underflow");
            throw new Exception("Stack is empty");
        }
        int removed = data[ptr];
        return removed;
    }
    public boolean isFull(){
        if(ptr == data.length-1){
            return true; // stack is full not have space to be inserted.
        }
        return false;
    }
    public boolean isEmpty(){
        if(ptr == -1){
            return true;  // stack is empty not have value of deleted.
        }
        return false;
    }






}
