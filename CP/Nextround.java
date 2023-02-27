import java.util.*;
public class Nextround{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int kthscore=arr[k-1];
        for(int i=0;i<n;i++){
            if(arr[i]>=kthscore && arr[i]!=0)count++;
            else break;
        }
        System.out.println(count);
    }
}