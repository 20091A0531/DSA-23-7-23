/* Question 4: Java Subarray

Skill Mapping: Basic

Description: Solve the HackerRank Problem given as a link below -

https://www.hackerrank.com/challenges/java-negative-subarray/problem */
import java.io.*;
import java.util.*;

public  class Solution {
    public static int find(int sum,int i,int a[]){
        if(i==a.length){
            if(sum<0) return 1;
            return 0;
        }
        return find(sum,i+1,a)+find(sum+a[i],i+1,a);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         int sum=0,count=0;
        for(int i=1,k,j;i<=n;i++){
            for(k=1;k<=n-i+1;k++){
                for(j=0;j<i;j++){
                    sum += a[j+k-1];
                }
                if(sum<0)
                    count++;
                sum = 0;
            }
    
        }
    System.out.print(count);
    }
}
