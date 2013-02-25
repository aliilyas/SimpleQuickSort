
public class QuickSort {
	
	int arrayOfNumbers[];
	
	public QuickSort(int[] initArray){
		
		this.arrayOfNumbers = initArray;
		
		sort(arrayOfNumbers[0],arrayOfNumbers.length-1);
		
		for(int i : arrayOfNumbers){
			System.out.println(""+i);
		}
	}
	
	private void sort(int minIndex, int maxIndex){
		int low = minIndex,high=maxIndex;
		int pivot = arrayOfNumbers[minIndex + (maxIndex-minIndex)/2];
		while(low<=high){
			while(arrayOfNumbers[low]<pivot){
				low++;
			}
			while(arrayOfNumbers[high]>pivot){
				high--;
			}
			if(low<=high){
				swap(low, high);
				low++;
				high--;
			}
		}
		if(minIndex<=high){
			sort(minIndex,high);
		}
		if(low<maxIndex){
			sort(low,maxIndex);
		}
	}
	
	private void swap(int i, int j){
		int temp = arrayOfNumbers[i];
		arrayOfNumbers[i] = arrayOfNumbers[j];
		arrayOfNumbers[j] = temp;
	}
	
	public static void main(String[] args){
		new QuickSort(new int[]{1,2,5,98,87,6});
	}
}
