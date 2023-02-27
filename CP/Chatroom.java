// import java.util.*;
// public class Chatroom {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int n=s.length();
//         String real="hello";
//         char ch[]=real.toCharArray();
//         Set<Character>set=new HashSet<>();
//         for(char c:ch)set.add(c);
//         String res="";
//         for(int i=0;i<n;i++){
//             char ch2=s.charAt(i);
//             if(set.contains(ch2)){
                
//             }
//         }
//         int k=0;
//         int count=0;
//         for(int i=0;i<res.length();i++){
//             char ch3=res.charAt(i);
//             if(ch3==ch[k++])count++;
//         }

//     }
// }
import java.util.Scanner;

public class Chatroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();

        String hello = "hello";
        int nextLetterIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hello.charAt(nextLetterIndex)) {
                nextLetterIndex++;
                if (nextLetterIndex == hello.length()) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
