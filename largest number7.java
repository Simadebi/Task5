public class LargestNumber {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {12, 45, 78, 23, 56, 89, 34};

        // Calling the method to find the largest number
        int largest = findLargest(numbers);

        // Printing the largest number
        System.out.println("The largest number in the array is: " + largest);
    }

    // Method to find the largest number
    public static int findLargest(int[] arr) {
        int max = arr[0]; // Assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger number is found
            }
        }
        return max;
    }
}



