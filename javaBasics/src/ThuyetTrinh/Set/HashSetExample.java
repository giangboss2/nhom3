package ThuyetTrinh.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Khởi tạo HashSet để lưu trữ chuỗi
        HashSet<String> stringSet = new HashSet<>();

        // Thêm phần tử vào HashSet
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");

        // Kiểm tra sự tồn tại của một phần tử
        boolean containsApple = stringSet.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);

        // Xóa một phần tử
        stringSet.remove("banana");

        // In ra HashSet
        System.out.println("HashSet elements: " + stringSet);

        // Lặp qua các phần tử trong HashSet (không đảm bảo thứ tự)
        System.out.println("Iterating over HashSet:");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }
    }
}
