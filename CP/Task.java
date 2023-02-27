import java.util.*;
public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String s2=".";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!isVowel(ch)){
                if(Character.isUpperCase(ch)){
                    s2+=Character.toLowerCase(ch)+".";
                }else s2+=ch+".";
                
            }
        }
        String ans="";
       for(int i=0;i<s2.length()-1;i++){
            ans+=s2.charAt(i);
       }
        System.out.println(ans);

    }
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='Y')
        return true;

        return false;
    }
}
