import java.util.*;
class Prime_pairs {
    private int n;
    public void get() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = obj.nextInt();
    }
    public int prime(int a) {
        int c=0,i;
        for(i=1;i<=a;i++){
            if(a%i == 0)
            c++;
        }
        if(c == 2)
        return 1;
        else
        return 0;
    }
    public void display() {
        int i,c=3;
        System.out.println("The Prime Pairs are:");
        while(c<=n){
            for(i=3;i<=n/2;i++){
                if(prime(i) == 1 && prime(c) == 1){
                    if((i+c)==n)
                    System.out.println(i+", "+c);
                }
            }
            c++;
        }
    }
    public static void main(String args[]){
        Prime_pairs obj = new Prime_pairs();
        obj.get();
        obj.display();
    }
}