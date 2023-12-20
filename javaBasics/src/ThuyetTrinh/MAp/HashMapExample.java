package ThuyetTrinh.MAp;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Khởi tạo HashMap với khóa là String và giá trị là Integer
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm phần tử vào HashMap
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grape", 3);

        // In ra HashMap (không có thứ tự cụ thể)
        System.out.println("HashMap elements: " + hashMap);

        // Truy cập giá trị tương ứng với khóa
        System.out.println("Number of apples: " + hashMap.get("apple")); // 5
        System.out.println("Number of oranges: " + hashMap.get("orange")); // 8

        // Lặp qua các phần tử trong HashMap (không có thứ tự cụ thể)
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
