import java.util.Arrays;

public class QuickSort
{
    public static void quickSort(int[] arr)
    {
        quickSortRecursive(arr, 0, arr.length - 1);
    }

    public static void quickSortRecursive(int[] arr, int low, int high)
    {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays before and after the partition
            quickSortRecursive(arr, low, partitionIndex - 1);
            quickSortRecursive(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] arr = {33, 25, 41, 5, 13, 85, 17};
        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}