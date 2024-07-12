import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10]; // Example array with extra space
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println("Array before insert: " + Arrays.toString(array));
        insert(array, 2, 99); // Insert 99 at index 2
        System.out.println("Array after insert: " + Arrays.toString(array));

        delete(array, 2); // Delete element at index 2
        System.out.println("Array after delete: " + Arrays.toString(array));
    }

    static void shiftRight(int[] A){
        int tmp = A[A.length-1];
        for(int i = A.length-1; i > 0; i--){
            A[i] = A[i-1];
        }
        A[0] = tmp;
        System.out.println(Arrays.toString(A));
    }
    static void shiftLeft(int[] A){
        int tmp = A[0];
        for(int i = 0; i < A.length-1; i++){
            A[i] = A[i+1];
        }
        A[A.length-1] = tmp;
        System.out.println(Arrays.toString(A));
    }
    static void insert(int[] A, int idx, int element) {
        if (idx < 0 || idx >= A.length) {
            System.out.println("Index out of bounds");
            return;
        }

        for (int i = A.length - 1; i > idx; i--) {
            A[i] = A[i - 1];
        }
        A[idx] = element;
    }
    static void delete(int[] A, int idx) {
        if (idx < 0 || idx >= A.length) {
            System.out.println("Index out of bounds");
            return;
        }

        for (int i = idx; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        }
        A[A.length - 1] = 0; // Optional: clear the last element
    }
    static int[] copyArray(int[] A, boolean reverse){
        int[] B = new int[A.length];
        if(!reverse)
            for(int i = 0; i < A.length; i++)
                B[i] = A[i];
        else
            for (int i = 0; i < A.length; i++)
                B[i] = A[A.length - 1 - i];
        return B;
    }

}