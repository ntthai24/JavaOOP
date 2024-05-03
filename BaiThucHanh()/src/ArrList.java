import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.remove("Green");
        colors.add("Pink");
        colors.add("Yellow");

        System.err.println(colors.get(4));
        System.err.println(colors.contains("Yellow"));
        System.err.println(colors.size());
        System.out.println(colors);
    }
}
