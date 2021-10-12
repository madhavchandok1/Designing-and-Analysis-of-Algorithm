/*
    <----------------------------------Algorithm for Selection Sort------------------------------->
    Selection Sort(A,n)
    
    Step 1: n <----- length(A)
    Step 2: for j <-------- 1 to n-1
    Step 3:     do smallest <------- j 
    Step 4:     for i <------ j+1 to n
    Step 5:         do if A[i]<A[smallest]
    Step 6:         then smallest <------ i
    Step 7:     Swap A[j] <-------- A[smallest]


*/


import java.util.*;

class SelectionSort{
    static void sort(int arr[], int n){
        for(int j=0;j<n-1;j++){
            int smallest=j;
            for(int i=j+1;i<n;i++){
                if(arr[i]<arr[smallest]){
                    smallest=i;
                }
            }
            int temp=arr[j];
            arr[j]=arr[smallest];
            arr[smallest]=temp;
        }
    }
    
    static void show(int arr[]){
        System.out.print(" The sorted array will be:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print(" Enter the number of elements you want to enter in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.print(" Enter the elements of the array you want to sort: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        sort(arr,n);
        show(arr);
    }
}