import java.util.*;

class InsertionSort{
    void sort(int []arr, int n){
        int key,j;
        
        for(int i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    
    static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the numbers of elements you want to enter in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        InsertionSort obj=new InsertionSort();  
        obj.sort(arr,arr.length);
        
        print(arr);
    }
}