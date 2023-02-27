import java.util.*;
public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer>set=new HashSet<>();
        set.add(4);set.add(7);
        List<Integer>list=new ArrayList<>();
        int num=n;
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        int numcount=0,sizecount=0;
       while(num>0){
        sizecount++;
        int rem=num%10;
        if(set.contains(rem)){
            numcount++;
        }
        num/=10;
       }
    if(sizecount==numcount)System.out.println("YES");
    else System.out.println("NO");

    }
}
