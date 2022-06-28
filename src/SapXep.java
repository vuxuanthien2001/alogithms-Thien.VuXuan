import java.lang.reflect.Array;
import java.util.ArrayList;

public class SapXep {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 4};
        System.out.println("Trước khi sắp xếp");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Sau khi sắp xếp");
        //BubbleSort(arr);
        //insertionSort(arr);
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // BubbleSort
    public static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length -1 ; i++){
            boolean kt = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                //compare
                if (arr[j] > arr[j+1]){
                    // convert
                    int tg = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tg;

                    kt = true;
                }
            }

            //Nếu không cần tráo đổi phần tử nào nữa thì
            //      tức là mảng đã được sắp xếp. Thoát khỏi vòng lặp

            if(kt == false){
                break;
            }
        }
    }

    // insertionSort
    public static void insertionSort(int arr[]){

        int holePosition;
        int valueToInsert;

        for(int i = 1; i < arr.length; i++){
        // select
            valueToInsert = arr[i];
            holePosition = i;
            // locate
            while (holePosition > 0 && arr[holePosition-1]> valueToInsert){
                arr[holePosition] = arr[holePosition-1];
                holePosition = holePosition -1 ;
            }
            // insert
            arr[holePosition] = valueToInsert;
        }
    }

    // SelectionSort
    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length -1 ; i++){
            // min
            int min = i;
            // check min
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // convert
            if (min != i){
                int tg = arr[min];
                arr[min] = arr[i];
                arr[i] = tg;
            }
        }
    }
}
