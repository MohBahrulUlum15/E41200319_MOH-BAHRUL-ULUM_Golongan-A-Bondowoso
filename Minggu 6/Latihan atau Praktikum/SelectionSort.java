package Sorting;
/**
 *
 * @author My Computer
 */
public class SelectionSort {
    
    void sort(int arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                //Banyak Proses Perbandingan :
//                System.out.println(" A : " + arr[j-1] + " < " + " B : " + arr[j]);
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
  
    // Prints the array (Ascending)
    void printArrayAscending(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Prints the array (Desscending)
    void printArrayDescending(int arr[])
    {
        int n = arr.length;
        for (int i = (n-1); i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort number = new SelectionSort();
        int arr[] = {64,25,12,22,11,70};
        
        //Before Sort
        System.out.println("Array Before Selection Sort");
        number.printArrayAscending(arr);
        System.out.println("");
        
        //After Sort
        number.sort(arr);
        
//        System.out.println("Array After Selection Sort");
        System.out.println("Array After Selection Sort (Ascending)");
        number.printArrayAscending(arr);
        
        System.out.println("");
        
        System.out.println("Array After Selection Sort (Descending)");
        number.printArrayDescending(arr);
    }
    
}
