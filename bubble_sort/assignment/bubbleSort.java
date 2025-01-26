import java.util.ArrayList;
import java.util.Arrays;

public class bubbleSort {

    // Bubble Sort Function  
    public static void bubbleSort(ArrayList<Integer> arr) {
        
        // Step 1: Iterate through the array starting from the first element.  
        // Step 2: Compare each pair of adjacent elements in the array.  
        // Step 3: If the first element is greater than the second, swap them.  
        // Step 4: Repeat steps 2-3 for all elements in the array, reducing the range after each pass.  
        // Step 5: Continue this process until no swaps are needed (array is sorted).  
        // Step 6: Return the sorted array.  

    }

    public static void main(String[] args) { 
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12,45,3,19,7,25));

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
