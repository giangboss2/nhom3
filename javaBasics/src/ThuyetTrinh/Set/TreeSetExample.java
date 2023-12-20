package ThuyetTrinh.Set;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        // Khởi tạo TreeSet để lưu trữ số nguyên
        TreeSet<Integer> numberSet = new TreeSet<>();

        // Thêm phần tử vào TreeSet
        numberSet.add(10);
        numberSet.add(5);
        numberSet.add(15);
        numberSet.add(5);
        numberSet.add(8);

        // In ra TreeSet (đã được sắp xếp tự nhiên)
        System.out.println("TreeSet elements: " + numberSet);

        // Lặp qua các phần tử trong TreeSet
        System.out.println("Iterating over TreeSet:");
        for (Integer num : numberSet) {
            System.out.println(num);
        }
    }
}
