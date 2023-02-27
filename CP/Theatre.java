import java.util.*;
public class Theatre{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long n=sc.nextInt();
       long m=sc.nextInt();
       long a =sc.nextInt();
        long ans=(long)Math.ceil((double)n/a) * (long)Math.ceil((double)m/a);
        System.out.println(ans);
    }
}