import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int value = sc.nextInt();
            arrayListInteger.add(value);
        }
        
        int max = arrayListInteger.get(0);
        for (int x : arrayListInteger) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
        
        System.out.print("Nhap phan tu can xoa: ");
        int valueToRemove = sc.nextInt();
        
        boolean removed = false;
        for (int i = 0; i < arrayListInteger.size(); i++) {
            if (arrayListInteger.get(i) == valueToRemove) {
                arrayListInteger.remove(i);
                i--;
                removed = true;
            }
        }
        
        if (removed) {
            System.out.println("Xoa phan tu thanh cong. ");
            System.out.println("Danh sach phan tu con lai sau khi da xoa: " + arrayListInteger);
        } else {
            System.out.println("Khong ton tai phan tu do! ");
        }
                
        arrayListInteger.sort((o1, o2) -> (o1 - o2));
        System.out.println("Cac phan tu sau khi da sap xep la: " + arrayListInteger);
    }
}
