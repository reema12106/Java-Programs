// Reverses the sentence and each word of the sentence
import java.util.*;
class ReverseSentence {
    private String s;
    public void get(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a sentence");
        s = obj.nextLine();
    }
    public String reverse(String a) {
        String wrd = "";
        int i;
        char ch;
        for(i=0;i<a.length();i++) {
            ch = a.charAt(i);
            wrd = ch+wrd;
        }
        return wrd;
    }
    public void display() {
        StringTokenizer st = new StringTokenizer(s);
        int c,i;
        String wrd,rwrd,nsen="";
        c = st.countTokens();
        for(i=1;i<=c;i++) {
            wrd = st.nextToken();
            rwrd = reverse(wrd);
            nsen = rwrd+" "+nsen;
        }
        System.out.println(nsen);
    }
    public static void main(String args[]) {
        ReverseSentence obj = new ReverseSentence();
        obj.get();
        obj.display();
    }
}