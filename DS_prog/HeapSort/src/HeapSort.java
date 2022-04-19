
public class HeapSort {
	int [] arr;
	
	
	public HeapSort()
	{
		this.arr = new int [8];
	}
	public void HeapSort(int [] arr)
	{
		int n = arr.length;
		for (int i = (n/2)-1; i>=0; i--)
		{
			Heapify(arr, i, 0);
		}
		for (int i = n; i>=0; i--)
		{
			int temp = arr[0];
			arr[0]=arr[n];
			arr[n] = temp;
			Heapify(arr, i, 0);
		}
	}
	
	private void Heapify(int [] arr, int i, int len)
	{
		int largest= i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		if(l<arr.length && arr[l]>arr[i])
		{
			largest = l;
		}
		if(r<arr.length && arr[r]>arr[i])
		{
			largest = r;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = temp;
			arr[largest] = temp;
			Heapify(arr, largest, len);
		}
	}
	
	static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}






