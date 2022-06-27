import java.util.ArrayList;

public class SapXep {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
        System.out.println("Trước khi sắp xếp");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("Sau khi sắp xếp");
        //BubbleSort(arrayList);
        //insertionSort(arrayList);
        SelectionSort(arrayList);
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    // Hoán vị
    public static void HoanVi(int a, int b){
        int tg = a;
        a = b;
        b = tg;
    }

    // Sắp xếp nổi bọt
    public static void BubbleSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() -1 ; i++){
            boolean kt = false;
            for (int j = 0; j < list.size() - 1; j++){
                //so sánh các phần tử cạnh nhau
                if (list.get(j) > list.get(j+1)){
                    // tráo đổi chúng
                    HoanVi(list.get(j), list.get(j+1));
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

    // Sắp xếp chèn
    /*public static void insertionSort(ArrayList<Integer> list){

        int holePosition;
        int valueToInsert;

        for(int i = 1; i < list.size(); i++){
        //chọn một giá trị để chèn
            valueToInsert = list.get(i);
            holePosition = i;
            //xác định vị trí cho phần tử được chèn
            while (holePosition > 0 && list.get(holePosition-1) > valueToInsert){
                list.get(holePosition) = list.get(holePosition - 1);
                holePosition = holePosition -1 ;
            }
            //chèn giá trị tại vị trí trên
            list.get(holePosition) = valueToInsert;
        }
    }*/

    // Sắp xếp chọn
    public static void SelectionSort(ArrayList<Integer> list){
        for (int i = 1; i < list.size() -1 ; i++){
            //thiết lập phần tử hiện tại là min
            int min = i;
            //kiểm tra phần tử có là nhỏ nhất không
            for (int j = i+1; j < list.size(); j++){
                if(list.get(j) < list.get(min)){
                    min = j;
                }
            }
            //tráo đổi phần tử nhỏ nhất với phần tử hiện tạ
            if (min != i){
                HoanVi(list.get(min), list.get(i));
            }
        }
    }
}
