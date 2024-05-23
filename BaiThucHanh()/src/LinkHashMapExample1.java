import java.util.LinkedHashMap;
import java.util.Set;

public class LinkHashMapExample1 {
    public static void main(String[] args) {
        // init linkedHashMap (khởi tạo)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // add element to linkedHashMap (thêm phần tử vào ...)
        linkedHashMap.put(1, "java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");
        // hiển trị trước khi xóa l
        System.out.println("Before remove: ");
        show(linkedHashMap);
        //remove element (xóa phần tử)
        linkedHashMap.remove(2);
        // hiển trị sau khi xóa l
        System.out.println("After remove: ");
        show(linkedHashMap);
    }
    //show HashMap
        public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
            // init Set
            Set<Integer> keySet = linkedHashMap.keySet();
            for (Integer key : keySet) {
                System.out.println(key + " " + linkedHashMap.get(key));
            }
        }
}
