import java.util.Arrays;

public class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++)
        {
            swapped = false;

            // Compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}