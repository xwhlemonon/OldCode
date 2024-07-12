package www.day.temp;

public class Quacked {
    public void qui(int[] arr, int low, int high) {
        if (low < high) {
            int flag = count(arr, low, high);
            qui(arr, low, flag - 1);
            qui(arr, flag + 1, high);
        }
    }

    public int count(int[] arr, int low, int high) {
        int flag = arr[low];
        while (low < high) {
            while ((low < high) && (arr[high] >= flag)) {
                high--;
            }
            arr[low] = arr[high];
            while ((low < high) && (arr[low] <= flag)) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = flag;
        return low;
    }
}
