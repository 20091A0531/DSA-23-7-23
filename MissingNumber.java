/*Question 2: Find missing numbers in array -

Skill Mapping: Basic

Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

Sample input: arrNum = {1, 2, 4, 5, 6}

Output: 3

Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

Output: 4, 7, 9, 12, 13 */
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
