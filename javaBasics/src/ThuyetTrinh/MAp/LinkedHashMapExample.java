package ThuyetTrinh.MAp;
import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Khởi tạo LinkedHashMap với khóa là String và giá trị là Integer
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm phần tử vào LinkedHashMap
        linkedHashMap.put("apple", 5);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("orange", 8);
        linkedHashMap.put("grape", 3);

        // In ra LinkedHashMap (theo thứ tự chúng được thêm vào)
        System.out.println("LinkedHashMap elements: " + linkedHashMap);

        // Truy cập giá trị tương ứng với khóa
        System.out.println("Number of apples: " + linkedHashMap.get("apple")); // 5
        System.out.println("Number of oranges: " + linkedHashMap.get("orange")); // 8

        // Lặp qua các phần tử trong LinkedHashMap (theo thứ tự chúng được thêm vào)
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
