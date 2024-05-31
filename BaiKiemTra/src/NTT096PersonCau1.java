import java.util.ArrayList;
import java.util.Scanner;

public class NTT096PersonCau1 {
    public String Ten;
    public int Tuoi;
    public String MaSinhVien;
    public String Lop;
    public String QueQuan;
    public String Chieucao;
    public String CanNang;

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void NhapThongTin () {
        System.out.println("Nhap Ten: ");
        Ten = sc.nextLine();
        System.out.println("Nhap Tuoi: ");
        Tuoi = sc.nextInt();
        System.out.println("Nhap Ma Sinh Vien: ");
    }
    public void ThemThongTin () {
        System.out.println("Nhap Lop: ");
        Lop = sc.nextLine();
        System.out.println("Nhap Que Quan: ");
        QueQuan = sc.nextLine();
        System.out.println("Nhap Chieu Cao: ");
        Chieucao = sc.nextLine();
        System.out.println("Nhap Can Nang: ");
        CanNang = sc.nextLine();
    }
    public void SuaThongTin () {
        
    }
    public void XoaThongTin() {
        arrayList.remove(Ten);
        arrayList.remove(Tuoi);
        arrayList.remove(MaSinhVien);
        arrayList.remove(Lop);
        arrayList.remove(Chieucao);
        arrayList.remove(QueQuan);
        arrayList.remove(CanNang);
    }
    public void HienThi() {
        System.out.println("Ten cua ban la: ");
        System.out.println("Tuoi: ");
        System.out.println("Ma Sinh Vien: ");
        System.out.println("Lop: ");
        System.out.println("Quen Quan: ");
        System.out.println("Chieu cao: ");
        System.out.println("Can Nang: ");
    }
}
