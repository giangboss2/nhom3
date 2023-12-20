package ThuyetTrinh.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Khởi tạo LinkedHashSet để lưu trữ chuỗi
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Thêm phần tử vào LinkedHashSet
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");

        // Thêm phần tử trùng lặp (sẽ không được thêm vào)
        linkedHashSet.add("apple");

        // In ra LinkedHashSet (theo thứ tự thêm vào)
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Lặp qua các phần tử trong LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
