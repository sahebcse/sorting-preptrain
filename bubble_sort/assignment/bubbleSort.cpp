#include <iostream>
#include <vector>
using namespace std;

void bubbleSort(vector<int> &arr)
{

    // Step 1: Iterate through the array starting from the first element.
    // Step 2: Compare each pair of adjacent elements in the array.
    // Step 3: If the first element is greater than the second, swap them.
    // Step 4: Repeat steps 2-3 for all elements in the array, reducing the range after each pass.
    // Step 5: Continue this process until no swaps are needed (array is sorted).
    // Step 6: Return the sorted array.

}

int main()
{
    // Example array as a vector
    vector<int> arr = {12,45,3,19,7,25};

    cout << "Original array: ";
    for (int i : arr)
    {
        cout << i << " ";
    }
    cout << endl;

    bubbleSort(arr);

    cout << "Sorted array: ";
    for (int i : arr)
    {
        cout << i << " ";
    }
    cout << endl;

    return 0;
}
