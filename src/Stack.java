public class Stack {
    private int[] arr;
    private int size;
    private int topIndex;

    public Stack(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topIndex = -1;
    }

    public void push(int value) {
        if (topIndex != size - 1) {
            topIndex++;
            arr[topIndex] = value;
        }
    }

    public int get() {
        int value = -1;
        if (topIndex >= 0) {
            value = arr[topIndex];
            topIndex--;
        }
        return value;
    }

    public void show() {
        if (topIndex < 0) {
            System.out.println("Stack trống");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(arr[i] + "");
            }
            System.out.println();
        }
    }

    public void getStack() {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        show();
    }

}
