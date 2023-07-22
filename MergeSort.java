import java.util.Arrays;

public class MergeSort
{
    public static void mergeSort(int[] arr)
    {
        if (arr.length <= 1)
        {
            return;
        }

        int middle = arr.length / 2;

        // Create left and right sub-arrays
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        // Recursively sort the left and right sub-arrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted left and right sub-arrays
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right)
    {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right sub-arrays into the original array
        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left and right sub-arrays (if any)
        while (i < left.length)
        {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {38, 27, 43, 3, 25, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}