public class DynamicStack extends CustomeStack {

    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public int push(int item) throws Exception{
        if(isFull()){
            // double the array size
            // copies all the item to the new array
            int[] temp = new int[data.length*2];
            for(int i = 0; i< data.length; i++){
                temp[i] = data[i];
            }
            // Referencing the temp to data;
            data = temp;
        }

        super.push(item);
        return item;
    }



}
