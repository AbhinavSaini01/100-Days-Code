#include <stdio.h>
#include <stdlib.h>

void countingSort(int arr[], int n, int k) {
    int count[k + 1];  // Array to store the count of each element
    int output[n];    // Array to store the sorted elements
    int i;

    // Initialize the count array with all elements as 0
    for (i = 0; i <= k; i++) {
        count[i] = 0;
    }

    // Store the count of each element in the input array
    for (i = 0; i < n; i++) {
        count[arr[i]]++;
    }

    // Update the count array to represent the position of each element in the sorted output array
    for (i = 1; i <= k; i++) {
        count[i] += count[i - 1];
    }

    // Build the output array
    for (i = n - 1; i >= 0; i--) {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    // Copy the sorted output array back to the original array
    for (i = 0; i < n; i++) {
        arr[i] = output[i];
    }
}

int main() {
    int arr[] = {4, 2, 2, 8, 3, 3, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    int i, max = arr[0];

    // Find the maximum element in the array
    for (i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    countingSort(arr, n, max);

    printf("Sorted array: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
