import java.util.ArrayList;
import java.util.Arrays;  

public class bubbleSort {  

    // Bubble Sort Function  
    public static void bubbleSort(ArrayList<Integer> arr) {  
        int n = arr.size();  

        // Step 1: Iterate through the array from start to end.  
        for (int i = 0; i < n - 1; i++) {  

            // Step 2: Compare adjacent elements in the array.  
            for (int j = 0; j < n - i - 1; j++) {  

                // Step 3: If the first element is greater than the second, swap them.  
                if (arr.get(j) > arr.get(j + 1)) {  
                    int temp = arr.get(j);  
                    arr.set(j, arr.get(j + 1));  
                    arr.set(j + 1, temp);  
                }  
            }  
        }  
        // Step 6: Return the sorted array.  
    }  

    public static void main(String[] args) {  

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 8));


        System.out.print("Original array: ");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  
        System.out.println();  

        bubbleSort(arr);  

        System.out.print("Sorted array: ");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  
        System.out.println();  
    }  
}  
