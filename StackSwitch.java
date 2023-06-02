    import java.util.*;
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
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty ");
            return 0;
        }
        else {
            int c=data[top];
            data[top]=0;
            top--;
            return c;

        }
    }
    void Display(){
        int i;
        for(i=0;i<=top;i++){
            System.out.print(data[i]+" ");

        }
        System.out.println();
    }
}
class StackSwitch{
    public static void main(String args[]){
        Test x=new Test();
        x.init();

        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
            System.out.println("Enter number: ");
            int no=sc.nextInt();
            if(no!=0){
                x.push(no);
                x.Display();
            }
            break;

            case 2:
            no=x.pop();
            System.out.println("Popped Element :"+ no);
            x.Display();
            break;

            case 3:
            System.out.println("Display all the stack elements :");
            x.Display();
            break;

            default :
            System.out.println("Enter valid Choice ");

        }

     }

        
    }
}