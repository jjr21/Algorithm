package QuickSort;
import java.util.Arrays;
public class quick {
    public static void main(String[] args){
        int [] questions = getArray();
        for(int x : questions) {
            System.out.print(" " + x);
        }
        sort(questions, 0, questions.length-1);
        System.out.println("\n" + "After sort"+ " \n");
        for (int x : questions){
            System.out.print(" "+ x);
        }
    }
    public static int [] getArray(){
        return new int [] {10, 80, 30, 90, 40, 50, 70};
    }
    public static int [] swap(int [] array, int small, int large){
        int hold = array[small];
        array[small] = array[large];
        array[large] = hold;
        return array;
    }
    public static void sort(int [] array, int small, int large){
        if(small < large){
            int pi = partition(array, small, large);
            sort(array, small, pi -1);
            sort(array, pi+1, large);
        }
    }
    public static int partition(int [] array, int small, int large){
        int pivot = array[large];
        int low = small -1;
        for(int x = small; x < large; x++){
            if(array[x]< pivot){
                low++;
                swap(array, low, x);

            }
        }
        swap(array, low+1, large);
        return low+1;
    }
}
