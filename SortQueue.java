import java.util.*;
public class SortQueue {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            int n=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
//            for(int j=0;j<n;j++){
//                q.add(sc.nextInt());
                q.add(5);
                q.add(1);
                q.add(2);
                q.add(6);
                q.add(3);
                q.add(4);
//            }
            System.out.println(sort(q));
        }
//    }
    public static String sort(Queue<Integer> q){
        Stack<Integer>stk=new Stack<Integer>();
        int i=1;
        while(!q.isEmpty()){
       int n=q.poll();
       if(n==i){
           i++;
       }
       else{
           if(stk.isEmpty()){
               stk.push(n);
           }
           else{
               int m=stk.peek();
               if(m==i){
                   while (i == m) {
                       stk.pop();
                   i++;
                   if(!stk.isEmpty()){
                   m=stk.peek();}
                   }
               }
               if(stk.isEmpty()){
                   stk.push(n);
               }
               else {
                   if(m>=n){
                       stk.push(n);
                   }
                   else {
                       return "No";
                   }
               }
           }
       }
       }
        if(stk.isEmpty()){
        return "Yes";}
        else{
            while(!stk.isEmpty()){
                if(stk.pop()==i){
                    i++;
                }
                else{
                    return "No";
                }
            }
            return "Yes";
        }
    }
}
