package Interface;

public class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Printable obj = new A6();
        obj.print();
    }
}
