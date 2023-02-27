import java.util.*;
public class Longwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        for(String word : words){
            int len=word.length();
            if(len>10){
                String res="";
                res+=word.charAt(0);
                res+=len-2;
                res+=word.charAt(len-1);
                System.out.println(res);
            }else{
                System.out.println(word);
            }
        }
    }
}
