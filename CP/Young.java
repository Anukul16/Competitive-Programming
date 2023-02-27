import java.util.*;
public class Young {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j][i];
            }
            if(sum==0)count++;
        }
        if(count==3)System.out.println("YES");
        else System.out.println("NO");
    }
}
