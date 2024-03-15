import java.util.Scanner;

public class Hinhtron {

    public final float Pi = 3.14f;
    public float r;
    public float cv;
    public float dt;

    Scanner sc = new Scanner(System.in);

void nhapbankinh() {
    System.out.print("Nhap ban kinh hinh tron: ");
    r = sc.nextFloat();
}

void tinhchuvi() {
    cv = 2*Pi*r;
}

void tinhdientich() {
    dt = Pi*r*r;
}

void inchuvi() {
    System.out.println("Chu vi cua hinh tron la: " + cv);
}

void indientich() {
    System.out.println("Dien tich cua hinh tron la: " + dt);
}

}
