public class QueueImp {
   class Queue{
       int val;
      Queue next;
       public Queue(int val){
this.val=val;
       }
       
   }
    Queue head;
    Queue tail;
    private int size=0;
    public void push(int n){
            Queue node = new Queue(n);
        if(head==null) {
            head=node;
            tail=node;
            size++;
        }
        else{
           tail.next=node;
           tail=node;
           size++;

        }

    }
    public int pop(){
        if(head==null){return -1;}
        Queue temp=head;
        head=head.next;
        temp.next=null;
        size--;
        return temp.val;
    }

    public void display(){
        if(head==null){
            System.out.println("Queue has no element!!");
        }
        else{
        Queue temp=head;
        while(temp!=null) {
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("Null");}
    }
    public int size(){
        return size;
    }
    public int peek(){
        if(head==null)
            return -1;
        return head.val;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int search(int num){
        if(head==null){
            return -1;
        }
        Queue temp=head;
        int i=0;
        while(temp!=null){
            if(temp.val==num)
                return i;
        i++;
        temp=temp.next;
        }
        return -1;
    }
}