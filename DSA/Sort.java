package DSA;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int arr[] =  new int[10];
        Random rand = new Random();
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000); // Random values between 0 and 999
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // O(n^2) time complexity
        // O(1) space complexity
        // bubbleSort(arr);
        // O(n^2) time complexity
        // O(1) space complexity
        // selectionSort(arr , minIdx);
        insersionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int ar : arr) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static void selectionSort(int arr[] , int minIdx){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            minIdx = i;
            for(int j = i + 1 ; j < n ; j ++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            for (int ar : arr) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }
    }

    public static void insersionSort(int arr[]){
        
    }
}
