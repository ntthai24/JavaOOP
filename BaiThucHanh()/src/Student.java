// 

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    
    public String Name;
    public String IdStudent;
    public String Subject;
    public double DiemA;
    public double DiemB;
    public double DiemC;
    public double Avg;
// Cách 1:
void Nhapthongtin() {
    System.out.print("Nhap Ho va Ten: ");
    Name = sc.nextLine();
    System.out.print("Nhap Ma Sinh Vien: ");
    IdStudent = sc.nextLine();
    System.out.print("Nhap ten cua mon hoc: ");
    Subject = sc.nextLine();
    System.out.print("Nhap diem A: ");
    DiemA = sc.nextDouble();
    System.out.print("Nhap diem B: ");
    DiemB = sc.nextDouble();
    System.out.print("Nhap diem C: ");
    DiemC = sc.nextDouble();
}

void Tinhdiemtongketmonhoc() {
    Avg = DiemA * 0.6 + DiemB * 0.3 + DiemC * 0.1;
}

void Xuatthongtin() {
    System.out.println("Ho Ten la: " + Name);
    System.out.println("Ma Sinh Vien: " + IdStudent);
    System.out.println("Ten mon hoc la: " + Subject);
    System.out.println("Diem Tong Ket Mon Hoc la: " + Avg);
}
// Cách 2:
void NhapHoTen() {
    System.out.print("Nhap Ho va Ten: ");
    Name = sc.nextLine();
}

void MaSinhVien() {
    System.out.print("Nhap ma sinh vien: ");
    IdStudent = sc.nextLine();
}

void TenMonHoc() {
    System.out.print("Nhap ten mon hoc: ");
    Subject = sc.nextLine();
}

void Diem() {
    System.out.print("Nhap diem A: ");
    DiemA = sc.nextDouble();
    System.out.print("Nhap diem B: ");
    DiemB = sc.nextDouble();
    System.out.print("Nhap diem C: ");
    DiemC = sc.nextDouble();
}

void DiemTongKet() {
    Avg = DiemA * 0.6 + DiemB * 0.3 + DiemC * 0.1;
}

void Inthongtin() {
    System.out.println("Ho va ten la: " + Name);
    System.out.println("Ma sinh vien la: " + IdStudent);
    System.out.println("Ten mon hoc la: " + Subject);
    System.out.println("Diem tong ket cua mon hoc la: " + Avg);
}

}
