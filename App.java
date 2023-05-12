public class App {
    public static void main(String[] args) throws Exception {
        int[] arr ={50, 54, 23, 20, 47,};
        bubbleSort(arr);
        System.out.println("array setelah diurutkan");
        printArray(arr);

        int[] arr2 ={58, 67, 32, 44, 99};
        insertionSort(arr2);
        System.out.println("array 2 setelah diurutkan");
        printArray(arr2);

        int[] arr3 ={77, 37, 12, 89, 59};
        selectionSort(arr3);
        System.out.println("array 3 setelah diurutkan");
        printArray(arr3);

    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + i] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int arr[])
    {
        int pos;
        int temp;
        for (int i= 0; i < arr.length; i++)
        {
            pos = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }

            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for  (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i= 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}