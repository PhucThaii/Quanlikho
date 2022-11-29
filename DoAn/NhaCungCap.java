package DoAn;

import java.util.Scanner;

public class NhaCungCap {
    private String MaNCC, TenNCC, DienThoai, Diachi;
    public NhaCungCap(){}
    public NhaCungCap(String ma, String ten, String sdt, String dc ){
        this.MaNCC=ma;
        this.TenNCC=ten;
        this.DienThoai=sdt;
        this.Diachi=dc;
    }
    public NhaCungCap(NhaCungCap ncc1){
        MaNCC=ncc1.MaNCC;
        TenNCC=ncc1.TenNCC;
        DienThoai=ncc1.DienThoai;
        Diachi=ncc1.Diachi;
    }
    public String getMaNCC() {
        return MaNCC;
    }
    public void setMaNCC(String ma) {
        this.MaNCC = ma;        
    }
    public String getTenNCC() {
        return TenNCC;
    }
    public void setTenNCC(String ten) {
        this.TenNCC = ten;        
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
        System.out.print("Nhap ma nha cung cap: ");
        MaNCC= sc.nextLine();
        System.out.print("Nhap ten nha cung cap: ");
        TenNCC= sc.nextLine();
        System.out.print("Nhap so dien thoai nha cung cap: ");
        DienThoai= sc.nextLine();
        System.out.print("Nhap dia chi nha cung cap: ");
        Diachi= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma nha cung cap: "+MaNCC+" ten nha cung cap: "+TenNCC+" So dien thoai: "+DienThoai+" Dia chi: "+Diachi);
    }
}
