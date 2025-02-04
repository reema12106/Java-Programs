import java.util.*;
class BubbleSort {
    private int a[],n;
    public void get() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = obj.nextInt();
        a = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++) {
            a[i] = obj.nextInt();
        }
    }
    public void sort() {
        int i,j,temp;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public void display(){
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]) {
        BubbleSort obj = new BubbleSort();
        obj.get();
        obj.sort();
        obj.display();
    }
}