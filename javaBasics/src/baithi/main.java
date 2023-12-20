package baithi;

import java.util.Arrays;

public class main {

    // Phương thức đảo ngược dãy bằng cách sao chép vào dãy mới
    public static int[] daoNguocMangCopy(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    // Phương thức đảo ngược dãy mà không tạo ra dãy mới
    public static void daoNguocMangKhongCopy(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Kiểm tra phương thức đảo ngược bằng cách sao chép vào dãy mới
        int[] reversedArrCopy = daoNguocMangCopy(arr);
        System.out.println("Dãy ban đầu: " + Arrays.toString(arr));
        System.out.println("Dãy sau khi đảo ngược bằng cách sao chép: " + Arrays.toString(reversedArrCopy));

        // Kiểm tra phương thức đảo ngược mà không tạo ra dãy mới
        daoNguocMangKhongCopy(arr);
        System.out.println("Dãy sau khi đảo ngược mà không tạo dãy mới: " + Arrays.toString(arr));
    }
}
