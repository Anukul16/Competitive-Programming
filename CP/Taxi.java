import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        if(sum%4==0){
            System.out.println(sum/4);
        }else System.out.println((sum/4)+1);
        

    }
}
