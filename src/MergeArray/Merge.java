package MergeArray;
import java.util.Arrays;
public class Merge {
    public static void main(String[] args){
        int [] question = getQuestion();

        int [] result = mergeSort(question);
        for(int x : result){
            System.out.print(x + " ");
        }
    }
    static int [] getQuestion(){
        int [] questions = {3,1,7,5,2,4,10, 13, 32, 22,10};
        for(int x : questions){
            System.out.print(x + " ");
        }
        System.out.print("\n");
        return questions;
    }
    static int [] mergeSort(int [] question){
        if(question.length <= 1){
            return question;
        }

        int [] array1 = Arrays.copyOfRange(question, 0, question.length/3);
        int [] array2 = Arrays.copyOfRange(question, question.length/3, question.length/3+question.length/3);
        int [] array3 = Arrays.copyOfRange(question, question.length/3+question.length/3, question.length);



       int [] half = getSort(mergeSort(array1), mergeSort(array2));
       return getSort(half, mergeSort(array3));

    }
    static int [] getSort(int [] array1, int [] array2){
        int [] result = new int[array1.length + array2.length];
        int i =0, j = 0, k =0;
        while(i < array1.length && j < array2.length){
            if(array1[i] <= array2[j]){
                result[k++] = array1[i++];
            }
            else if(array1[i]>array2[j]){
                result[k++] = array2[j++];
            }
        }
        while(i < array1.length){
            result[k++] = array1[i++];
        }
        while(j < array2.length){
            result[k++] = array2[j++];
        }
        return result;
    }
}
