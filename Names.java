//Input: Mahendra Singh Dhoni 
// Output: M. S. Dhoni
import java.util.*;
class Names {
    private String sen;
    public void get() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a name");
        sen = obj.nextLine();
    }
    public String FirstLetter(String s) {
        String wrd;
        char ch;
        ch = s.charAt(0);
        wrd = ch + "."+" ";
        return wrd;
    }
    public void display() {
        StringTokenizer st = new StringTokenizer(sen);
        int i,c;
        String wrd,wrd1,s="",s1="",lwrd = "";
        c = st.countTokens();
        for(i=1;i<=c;i++) {
            wrd = st.nextToken();
            if(i==c){
                lwrd = wrd;
            }
            else {
                wrd1 = FirstLetter(wrd);
                s = s+ wrd1;
            }
        s1 = s+lwrd;
        }
        System.out.println(s1);
    }
    public static void main(String args[]){
        Names obj = new Names();
        obj.get();
        obj.display();
    }
}