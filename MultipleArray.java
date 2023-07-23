
import java.util.*;
public class MultipleArray {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array:");
        try {
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int b=1;
            for(int i=0;i<n;i++){
                b=b*a[i];
                a[i]=b;
            }
            System.out.print("The Elements of the array are:");
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
        catch(Exception e){
            System.out.print("Enter valid input");
        }
    }
}