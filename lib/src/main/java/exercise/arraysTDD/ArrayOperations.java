package exercise.arraysTDD;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
    	for(int elem:numbers) {
    		System.out.println(elem);
    	}
    	for(int elem:unsorted) {
    		System.out.println(elem);
    	}
        
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
    	int temp;
    	for (int i=0; i<(numbers.length-1); i++){
            if(numbers[i]>numbers[i+1]){
                
                for(int j=i; j>=0;j--){
                    if(numbers[j]>numbers[j+1]){
                        temp=numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;
                    }
                }
            }
    	}
       return numbers;
    }

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
    	int temp;
    	for (int i=0; i<(numbers.length-1); i++){
            if(numbers[i]<numbers[i+1]){
                
                for(int j=i; j>=0;j--){
                    if(numbers[j]<numbers[j+1]){
                        temp=numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;
                    }
                }
            }

        }
        return numbers;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
    	int[] arr = new int[unsorted.length];
    	for(int i=0; i<arr.length;i++) {
    		arr[arr.length-i-1]=unsorted[i];
    	}
    	
    	
        return arr;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
    	boolean check = false;
    	for(int i=0;i<numbers.length;i++) {
    		if(numbers[i]==value) {
    			check=true;
    			break;
    		}
    	}
        return check;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
    	double average=0.0;
    	for(int elem:numbers) {
    		average=average+elem;
    	}
    	average=average/numbers.length;
        return average;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        double mean=0.0;
    	int temp;
    	for (int i=0; i<(numbers.length-1); i++){
            if(numbers[i]>numbers[i+1]){
                
                for(int j=i; j>=0;j--){
                    if(numbers[j]>numbers[j+1]){
                        temp=numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;
                    }
                }
            }
    	}
    	for(int i=1; i<(numbers.length-1);i++) {
    		mean=mean+numbers[i];
    	}
    	mean=mean/(numbers.length-2);
    	return mean;
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
    	int max=numbers[0];
    	for(int i=0; i<numbers.length;i++) {
    		if(numbers[i]>max) {
    			max=numbers[i];
    		}
    	}
        return max;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
    	int min=numbers[0];
    	for(int i=0; i<numbers.length;i++) {
    		if(numbers[i]<min) {
    			min=numbers[i];
    		}
    	}
        return min;
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
        return 1;
    }
}
