import java.util.*;
public class Bit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=null;
        int ans=0;
        for(int i=0;i<n;i++){
            s=sc.next();
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='+'){
                    ans++;
                    break;
                }
                else if(ch=='-'){
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}