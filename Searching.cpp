#include <iostream>
using namespace std;

int main() {

    int size;
    cout << "Enter the size of the array: ";
    cin >> size;
    int arr[size];

    // Input array from the user
    for (int i = 0; i < size; i++) {
        cout << "Enter Number " << i + 1 << ": ";
        cin >> arr[i];
    }

    // Print the original array
    cout << "Original Array:" << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << "\t";
    }

    for(int i = 0; i<size;i++) {
        for(int j = i+1; j<size; j++) {
            if(arr[j]<arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    cout << endl;
    cout << "Sorted Array in Descending Order:" << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << "\t";
    }

    return 0;
}
