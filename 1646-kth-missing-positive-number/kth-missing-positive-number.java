class Solution {
    public int findKthPositive(int[] arr, int k) {
        int currentMissing = 0;
        int arrIndex = 0;
        int currentNumber = 1;
        
        while (true) {
            // If the current number exists in the array, move to the next array element
            if (arrIndex < arr.length && arr[arrIndex] == currentNumber) {
                arrIndex++;
            } else {
                // Otherwise, it's a missing number! Count it down.
                currentMissing++;
                if (currentMissing == k) {
                    return currentNumber; // Found the k-th missing number
                }
            }
            currentNumber++;
        }
    }
}