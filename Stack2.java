class Test{
    private final int max=10;
    private int data[];
    private int top;
    void init(){
        data=new int[max];
        top=-1;
    }
    void push(int n){
        if(top==max-1){
            System.out.println("Stack is overflow");
        }
        else {
            top++;
            data[top]=n;
        }
    }
    void Display(){
        int i;
        for(i=0;i<=top;i++){
            System.out.print(data[i]+" ");
        }
    }
}
class Stack2{
    public static void main(String args[]){
        Test x=new Test();
        x.init();
        x.push(12);
        x.push(53);
        x.push(42);
        x.push(81);
        x.push(53);
        x.push(31);
        x.Display();
    }
}