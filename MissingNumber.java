import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=1,i=0;
        while(b!=a[n-1]){
            if(a[i]==b){
                i+=1;
                b+=1;
            }
            else{
                System.out.print(b+" ");
                b+=1;
            }
        }
    }
}
