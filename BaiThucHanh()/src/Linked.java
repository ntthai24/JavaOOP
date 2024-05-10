import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("-----------------------------------");
        LinkedList<String> listA = new LinkedList<String>();  //khởi tạo
        //Thêm các phần tử của list vào list A
        listA.addAll(list);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("-----------------------------------");

        LinkedList<String> listB = new LinkedList<String>(); //khởi tạo
        listB.add("Java");
        //Xóa những phần tử không thuộc listB ra khỏi listA
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("-----------------------------------");
        list.removeAll(listB);  //Xóa những phần tử thuộc listB ra khỏi list
        System.out.println("list: ");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for(String obj : list) {
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
}
