// Find the total numbers of pairs in the array whose sum is equal to the given value x.
#include<iostream>
using namespace std;

int main() {
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    int count=0, x=5;
    for (int i=0; i<10; i++) {
        for (int j=i+1; j<10; j++) {
            if (arr[i]+arr[i+1]==x){
                count++;
            }   
        }
    }
    cout<<count;
    return 0;
}