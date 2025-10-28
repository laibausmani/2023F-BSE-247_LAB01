package lab04;
//import java.util.Arrays;
//public class Lab04 {
//    public static void main(String[] args) {
//        int[] A1 = {2,4,6,8};
//        int[] A2 = {1,3,5,7};
//
//        System.out.println("Original arrays:");
//        System.out.println("Array 1: " + Arrays.toString(A1));
//        System.out.println("Array 2: " + Arrays.toString(A2));
//        
//        for (int i = 0; i < 4; i++) {
//            int temp = A1[i];
//            A1[i] = A2[i];
//            A2[i] = temp;
//        }
//        System.out.println("Swapped arrays:");
//        System.out.println("Array 1: " + Arrays.toString(A1));
//        System.out.println("Array 2: " + Arrays.toString(A2));
//    }
//}



//import java.util.Arrays;
//public class Lab04 {
//    public static void main(String[] args) {
//
//        int[] A1 = {56,97,34,89};
//        int[] A2 = {45,78,23,556};
//        int[] mergedArray = mergeArrays(A1, A2);
//        System.out.println("Merged array: " + Arrays.toString(mergedArray));
//    }
//
//    public static int[] mergeArrays(int[] A1, int[] A2) {
//        int[] mergedArray = new int[A1.length + A2.length];
//
//        for (int i = 0; i < A1.length; i++) {
//            mergedArray[i] = A1[i];
//        }
//        for (int i = 0; i < A2.length; i++) {
//            mergedArray[A1.length + i] = A2[i];
//        }
//        
//        return mergedArray;
//    }
//}


//import java.util.Scanner;
//public class Lab04 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of strings: ");
//        int size = sc.nextInt();
//        sc.nextLine(); 
//        String[] words = new String[size];
//        System.out.println("Enter the strings:");
//        for (int i = 0; i < size; i++) {
//            words[i] = sc.nextLine();
//        }
//        for (String word : words) {
//            if (isPalindrome(word)) {
//                System.out.println(word + " is a palindrome.");
//            } else {
//                System.out.println(word + " is not a palindrome.");
//            }
//        }
//    }
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}
//

//
//public class Lab04 {
//    public static void main(String[] args) {
//        int[] no = {3,6,5,7,5};
//        int even = 0;
//        int odd = 0;
//        
//        for (int num : no) {
//            if (num % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//
//        System.out.println("Number of even numbers: " + even);
//        System.out.println("Number of odd numbers: " + odd);
//
//    }
//}


import java.util.Arrays;

public class Lab04 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int[] mergedArray = mergeRemoveDuplicate(arr1, arr2);
        
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeRemoveDuplicate(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        
        int[] uniqueArray = new int[mergedArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (mergedArray[i] == uniqueArray[j]) {
                    isDuplicate = true; 
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount++] = mergedArray[i];
            }
        }
        return Arrays.copyOf(uniqueArray, uniqueCount);
    }
}



//import java.util.Arrays
//public class Lab04 {
//    public static int[] mergeAndRemoveDuplicates(int[] A1, int[] A2) {
//        // Step 1: Create a new array with a size that can fit all elements from both arrays
//        int[] tempArray = new int[A1.length + A2.length];
//        int index = 0;
//
//        // Step 2: Add all elements from the first array
//        for (int num : A1) {
//            if (!contains(tempArray, index, num)) { // Check for duplicates
//                tempArray[index++] = num;
//            }
//        }
//
//        // Step 3: Add all elements from the second array
//        for (int num : A2) {
//            if (!contains(tempArray, index, num)) { // Check for duplicates
//                tempArray[index++] = num;
//            }
//        }
//
//        // Step 4: Create the final result array with the exact number of unique elements
//        int[] result = new int[index];
//        System.arraycopy(tempArray, 0, result, 0, index);
//
//        return result;
//    }
//
//    // Helper method to check if the array contains a number up to a certain index
//    public static boolean contains(int[] array, int length, int value) {
//        for (int i = 0; i < length; i++) {
//            if (array[i] == value) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 4};
//        int[] array2 = {3, 4, 5, 6};
//
//        int[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
//
//        System.out.println("Merged Array (with duplicates removed): " + Arrays.toString(mergedArray));
//    }
//}


//public class Lab04 {
//    public static void main(String[] args) {
//        double[] numbers = {1.2, 2.5, 3.8, 4.1, 5.6, 6.3, 7.0};
//        double sum = 0;
//
//        for (double num : numbers) {
//            sum += num;
//        }
//
//        double mean = sum / numbers.length;
//        System.out.println("Sum: " + sum);
//        System.out.println("Mean: " + mean);
//    }
//}


//import java.util.Arrays;
//public class Lab04 {
//    public static void main(String[] args) {
//        int[] Arr = {1, 2, 3, 4, 5, 6};
//        int key = 3;
//        splitArray(Arr, key);
//    }
//    public static void splitArray(int[] Arr, int key) {
//        int index = -1;
//                for (int i = 0; i < Arr.length; i++) {
//            if (Arr[i] == key) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            System.out.println("First Part: " + Arrays.toString(Arrays.copyOfRange(Arr, 0, index)));
//            System.out.println("Second Part: " + Arrays.toString(Arrays.copyOfRange(Arr, index, Arr.length)));
//        } else {
//            System.out.println("Key not found.");
//        }
//    }
//}


//



//public class Lab04 {
//    public static void main(String[] args) {
//        int[] arr = {3, 0, 1};
//        System.out.println("The missing number is: " + findNumber(arr));
//    }
//    public static int findNumber(int[] arr) {
//        int n = arr.length;
//        int sumOfArray = 0;
//        int sumOfRange = 0;
//        
//        for (int num : arr) {
//            sumOfArray += num;
//        }
//        for (int i = 0; i <= n; i++) {
//            sumOfRange += i;
//        }
//        return sumOfRange - sumOfArray;
//    }
//}


//import java.util.Arrays;
//
//public class Lab04 {
//    public static void ZZsort(int[] arr) {
//        Arrays.sort(arr);
//        for (int i = 1; i < arr.length - 1; i += 2) {
//            int temp = arr[i];
//            arr[i] = arr[i + 1];
//            arr[i + 1] = temp;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {4, 3, 7, 8, 6, 2, 1};
//        ZZsort(arr);
//        System.out.println("Zigzag Array: " + Arrays.toString(arr));
//    }
//}

