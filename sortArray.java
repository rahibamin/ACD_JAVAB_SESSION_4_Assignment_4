package Session4.Assignmnet4;

public class sortArray {

	static int minIndex(int arr[], int a, int b){
		if(a == b)
			return a;

		int c = minIndex(arr, a + 1, b);

		return (arr[a] < arr[c])? a : c;
	}

	static void sort(int arr[], int n, int index){
		if(index == n)
			return;
		int min = minIndex(arr, index, n-1);

		if(min != index){
			int temp = arr[min];
			arr[min] = arr[index];
			arr[index] = temp;
		}

		sort(arr, n, index + 1);
	}


	static public void printArray(int[] arr){
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {

		int[] arr = {10, 40, 20, 30, 50};

		System.out.print("Your unsorted Array: ");
		printArray(arr);

		sortArray.sort(arr, arr.length, 0);

		System.out.print("Your sorted Array: ");
		printArray(arr);
	}
}