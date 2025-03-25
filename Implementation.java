public class Implementation {
    public static void main(String[] args) {
        QueueImp obj=new QueueImp();
        System.out.println(obj.isEmpty());
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.push(20);
        obj.push(25);
        obj.push(30);
        obj.display();
        System.out.println(obj.pop());
        obj.display();
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.search(20));
        System.out.println(obj.search(40));
    }
}
