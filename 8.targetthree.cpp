// Count the number of triblets whose sumis equal to given value x.
#include<iostream>
using namespace std;

int main() {
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    int count=0, x=5;
    int size = 10;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (arr[i]+arr[j]+arr[k] == x) {
                    count++;
                }
            }
        }
    }
    
    cout<<count<<endl;
    return 0;
}