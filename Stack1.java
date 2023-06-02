class Example{
    private int max=10;
    private int data[];
    private int top;
    void init(){
        data=new int[max];
        top=-1;
    }
    void push(int n){
        if(top==max-1){
            System.out.println("Stack is overflowed");
        }
        else{
            top++;
            data[top]=n;
        }
    }
    void display(){
        int i;
        for(i=0;i<=top;i++){
            System.out.println(data[i]+" ");
        }
    }
    int pop(){
        int d;
        if(top==-1){
            System.out.println("Stack is empty");
            return 0;
          
        }
        else{
            d=data[top];
            data[top]=0;
            top--;
            return d;
        }
       
    }
   

        
    
}
class Stack1{
     public static void main(String args[]){
        Example x=new Example();
        x.init();
        x.push(23);
        x.push(44);
        x.push(74);
        x.push(83);
        x.push(73);
        x.push(18);
        x.display();
        int c=x.pop();
        System.out.println("the popped element is "+c);
     }


}