/*Sum of n terms in an array */

import java.util.*;
class Q1{
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input n : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Sum of "+n+" terms: "+sum);
    }
}
