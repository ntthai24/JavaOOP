import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, Float> hashMap1 = new HashMap<>();

        HashMap<String, String> hashMap2 = new HashMap<>(10);
        
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);
        
        TreeMap<Float, Integer> treeMap = new TreeMap<>();
        treeMap.put(1.1f, 10);
        treeMap.put(2.2f, 20);
        treeMap.put(3.3f, 30);
        HashMap<Float, Integer> hashMap4 = new HashMap<>(treeMap);
    }
}
