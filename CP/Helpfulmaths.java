import java.util.*;
public class Helpfulmaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='+')list.add(s.charAt(i));
        }
        Collections.sort(list);
        String ans="";
        for(int i=0;i<list.size();i++){
            ans+=list.get(i)+"+";
        }
        
        System.out.print(ans.substring(0,ans.length()-1));
        
    }
}
