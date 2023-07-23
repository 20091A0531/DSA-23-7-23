import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Singular {
    public static void main(String args[]){
        int n,count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(mp.containsKey(a[i])){
                mp.replace(a[i],mp.get(a[i])+1);
            } else {
                mp.put(a[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> e : mp.entrySet()){
            if(e.getValue()%2!=0){
                count+=1;
            }
        }
        System.out.print(count);
    }
}
