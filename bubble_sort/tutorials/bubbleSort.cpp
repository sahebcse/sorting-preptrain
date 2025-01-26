#include <iostream>  
#include <vector>  
using namespace std;  
 
void bubbleSort(vector<int>& arr) {  
    int n = arr.size();  

    // Step 1: Iterate through the array from start to end.  
    for (int i = 0; i < n - 1; i++) {  

        // Step 2: Compare adjacent elements in the array.  
        for (int j = 0; j < n - i - 1; j++) {  

            // Step 3: If the first element is greater than the second, swap them.  
            if (arr[j] > arr[j + 1]) {  
                int temp = arr[j];  
                arr[j] = arr[j + 1];  
                arr[j + 1] = temp;  
            }  
        }  
    }  
    // Step 6: Return the sorted array.  
}  

int main() {  
    // Example array as a vector  
    vector<int> arr = {5, 1, 4, 2, 8};  

    cout << "Original array: ";  
    for (int i : arr) {  
        cout << i << " ";  
    }  
    cout << endl;  

    // Step 5: Repeat the loop until the array is sorted.  
    bubbleSort(arr);  

    cout << "Sorted array: ";  
    for (int i : arr) {  
        cout << i << " ";  
    }  
    cout << endl;  

    return 0;  
}  
