package DSA;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search : ");
        int target = sc.nextInt();
        sc.close();
        int ans = linearSearch(arr, target);
        int idx = binarySearch(arr, target);
        if(ans!=-1) 
            System.out.println("Element fount at position through linear search : " + ans);
        else
            System.out.println("Element not found");
        if(idx !=-1 )
            System.out.println("Element fount at position through binary search : " + idx);
        else
            System.out.println("Element not found");
        
    }

    public static int linearSearch(int arr[], int target) {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
