import java.util.*;
class stack <T>{
    ArrayList<T> S;
    int top=-1,size;
    stack(int s){
        this.size=s;
        this.S=new ArrayList<T>(size);
    }
    void push(T newData){
        if(top+1==size){
            System.out.println("stack overflow");
        }
        else{
            top++;
            if(S.size()>top){
                S.set(top,newData);
            }
            else{
                S.add(newData);
            }
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack underflow");
        }
        else{
            top--;
        }
    }
    T top(){
        if(top==-1){
            System.out.println("stack overflow");
            return null;
        }
        else{
            return S.get(top);
        }
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println(S.get(i));
        }
    }
    
}

public class stack_imp{
    public static void main(String args[]){
        stack<Integer> obj=new stack<>(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(50);
        System.out.println("After Push");
        obj.display();
        obj.pop();
        obj.pop();
        System.out.println("After Pop");
        obj.display();
        System.out.println("TOP");
        System.out.println(obj.top());
    }
}
