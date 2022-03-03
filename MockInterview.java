import java.io.*; \
import java.util.*;
class Mockinterview{
    public static void main(String args[]) {
               int arr[] ={1,-3,-5,4,5,-2};
int size = arr.length;
int index = 0;
int aar[] = new int[size];
for(int i=0; i<size; i++){
if(arr[i]>0){
    aar[index] = arr[i];
    index++;
 }
}
 for(int j=0; j<size; j++){
    if(arr[j]<0){
        aar[index] = arr[j];
        index++;
     }
 } 
            System.out.print(Arrays.toString(aar));
            System.out.println();
             int nwithoutrev =  123321;
             int n = nwithoutrev;
             int nrev = 0; 
             while(n>0)
             {
                 int a = n%10;
                 nrev = nrev*10 + a;
                 n = n/10;
             }
             if(nrev==nwithoutrev){
             System.out.println(nrev+" Is palindrome number.");
             }
             System.out.print("All The  prime numbers are -> ");
             int arr1[] =  {12,34,2,4,5,7,34};

             for(int i= 0; i<arr1.length; i++)
             {
              int c = 0;
              for(int j=2; j<arr1[i]; j++){
                  if(arr1[i]%j==0){
                c++;
                  }
              }
              if(c==0){
                 System.out.print(arr1[i]+", ");
                }
              
             }
             System.out.println();
 
   }  
}
