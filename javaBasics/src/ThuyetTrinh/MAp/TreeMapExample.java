package ThuyetTrinh.MAp;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Khởi tạo TreeMap với khóa là String và giá trị là Integer
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Thêm phần tử vào TreeMap
        treeMap.put("apple", 5);
        treeMap.put("banana", 2);
        treeMap.put("orange", 8);
        treeMap.put("grape", 3);

        // In ra TreeMap (đã được sắp xếp theo thứ tự tăng dần của khóa)
        System.out.println("Các phần tử trong TreeMap: " + treeMap);

        // Truy cập giá trị tương ứng với khóa
        System.out.println("Tương Ứng với  apples: " + treeMap.get("apple")); // 5
        System.out.println("Tương Ứng với oranges: " + treeMap.get("orange")); // 8

        // Lặp qua các phần tử trong TreeMap (theo thứ tự tăng dần của khóa)
        System.out.println("lặp qua các phần tử của TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
