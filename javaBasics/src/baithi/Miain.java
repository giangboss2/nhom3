package baithi;

import java.util.Scanner;

public class Miain {
    // Phương thức kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức nhập số nguyên dương lớn hơn 1
    public static int nhapSoNguyenDuong() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập một số nguyên dương lớn hơn 1: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập một số nguyên.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 1);
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số phần tử của dãy
        int n;
        do {
            System.out.print("Nhập số phần tử của dãy (5<=n<=10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập một số nguyên.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 5 || n > 10);

        // Khởi tạo mảng
        int[] arr = new int[n];

        // Nhập dãy số nguyên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = nhapSoNguyenDuong();
        }

        // Tính và in ra tổng các số nguyên tố trong dãy
        int sumSoNguyenTo = 0;
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(arr[i])) {
                sumSoNguyenTo += arr[i];
            }
        }
        System.out.println("Tổng các số nguyên tố trong dãy là: " + sumSoNguyenTo);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
