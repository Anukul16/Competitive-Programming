import java.util.*;
public class Petya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1>ch2){
                System.out.println(1);
                return;
            }else if(ch1<ch2){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(0);
    }
}
