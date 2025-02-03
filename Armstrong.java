import java.util.*;
class Armstrong {
    private int n;
    public void get() {
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
    }
    public int isArmstrong(int a) {
        int d,x = 0,i;
        for(i=a;i!=0;i=i/10) {
            d = i%10;
            x = x + (int)Math.pow(d,3);
        }
        if(x == a)
        return 1;
        else
        return 0;
    }
    public void display() {
        int a;
        a = isArmstrong(n);
        if(a == 1)
        System.out.println(n+" is an Armstrong number");
        else
        System.out.println(n+" is not an Armstrong number");
    }
    public static void main(String args[]) {
        Armstrong obj = new Armstrong();
        obj.get();
        obj.display();
    }
}