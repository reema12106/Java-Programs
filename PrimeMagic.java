import java.util.*;
class PrimeMagic {
    private int n;
    public void get() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = obj.nextInt();
    }
    public int prime(int a) {
        int c = 0,i;
        for(i = 1; i <= a; i++) {
            if(a%i == 0)
            c++;
        }
        if(c == 2)
        return 1;
        else
        return 0;
    }
    public int sumdigit(int a) {
        int sum = 0,d,i;
        for(i = a;i!=0;i=i/10) {
            d = i%10;
            sum = sum + d;
        }
        return sum;
    }
    public int isMagic(int a) {
        int p;
        while(a>9) {
            p = sumdigit(a);
            a = p;
        }
        if(a == 1)
        return 1;
        else
        return 0;
    }
    public void display() {
        int a,b;
        a = isMagic(n);
        b = prime(n);
        if(a == 1 && b == 1)
        System.out.println(n+" is a Prime Magic Number");
        else
        System.out.println(n+" is not a Prime Magic Number");

    }
    public static void main(String args[]) {
        PrimeMagic a = new PrimeMagic();
        a.get();
        a.display();
    }
}