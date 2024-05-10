import java.util.LinkedList;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list.add("Thang 1");
        list.add("Thang 2");
        list.add("Thang 3");
        list.add("Thang 4");
        list.add("Thang 5");
        list.add("Thang 6");
        list.add("Thang 7");
        list.add("Thang 8");
        list.add("Thang 9");
        list.add("Thang 10");
        list.add("Thang 11");
        list.add("Thang 12");

        System.out.print("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();

        if ((index < 0) || (index > (list.size() -1))) {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (list.size() -1));
        } else {
            String node = list.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la: "  + node);
        }
        String firstNode = list.getFirst();
        String lastNode = list.getLast();

        System.out.println("\nPhan tu dau tien trong danh sach la : " + firstNode + "; Phan tu cuoi cung trong danh sach la : " + lastNode);
    }
}
