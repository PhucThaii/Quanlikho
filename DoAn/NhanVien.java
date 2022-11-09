package DoAn;

import java.util.Scanner;

public class NhanVien {
    private String MaNV;
    private String HoNV;
    private String TenNV;
    private String DienThoai;
    private String Diachi;
    public NhanVien(){}
    public NhanVien(String ma, String ho, String ten, String sdt, String dc ){
        this.MaNV=ma;
        this.HoNV=ho;
        this.TenNV=ten;
        this.DienThoai=sdt;
        this.Diachi=dc;
    }
    public NhanVien(NhanVien nv1){
        MaNV=nv1.MaNV;
        HoNV=nv1.HoNV;
        TenNV=nv1.TenNV;
        DienThoai=nv1.DienThoai;
        Diachi=nv1.Diachi;
    }
    public String getMaNV() {
        return MaNV;
    }
    public void setMaNV(String ma) {
        this.MaNV = ma;        
    }
    public String getTenNV() {
        return TenNV;
    }
    public void setTenNV(String ten) {
        this.TenNV = ten;        
    }
    public String getDienThoai() {
        return DienThoai;
    }
    public void setDienThoai(String sdt) {
        this.DienThoai = sdt;        
    }
    public String getDiaChi() {
        return Diachi;
    }
    public void setDiaChi(String dc) {
        this.Diachi = dc;        
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        MaNV= sc.nextLine();
        System.out.print("Nhap ho nhan vien: ");
        HoNV= sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        TenNV= sc.nextLine();
        System.out.print("Nhap so dien thoai nhan vien: ");
        DienThoai= sc.nextLine();
        System.out.print("Nhap dia chi nhan vien: ");
        Diachi= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma nhan vien: "+MaNV+" Ho va ten: "+HoNV+" "+TenNV+" So dien thoai: "+DienThoai+" Dia chi: "+Diachi);
    }


}




