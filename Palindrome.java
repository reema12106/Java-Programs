import java.util.*;
class Palindrome {
    private int n;
    public void get(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        n = obj.nextInt();
    }
    public int palin(int a){
        int i,d,rev=0;
        for(i=a;i!=0;i=i/10){
            d = i%10;
            rev = rev*10+d;
        }
        if(rev == a) 
        return 1;
        else
        return 0;
    }
    public void display(){
        int b;
        b = palin(n);
        if(b == 1)
        System.out.println(n+" is a Palindrome number");
        else
        System.out.println(n+" is not a Palindrome number");
    }
    public static void main(String args[]){
        Palindrome obj = new Palindrome();
        obj.get();
        obj.display();
    }
}