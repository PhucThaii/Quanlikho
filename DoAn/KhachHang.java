package DoAn;

import java.util.Scanner;

public class KhachHang {
    private String MaKH;
    private String HoKH;
    private String TenKH;
    private String DienThoai;
    private String Diachi;
    public KhachHang(){}
    public KhachHang(String ma, String ho, String ten, String sdt, String dc ){
        this.MaKH=ma;
        this.HoKH=ho;
        this.TenKH=ten;
        this.DienThoai=sdt;
        this.Diachi=dc;
    }
    public KhachHang(KhachHang kh1){
        MaKH=kh1.MaKH;
        HoKH=kh1.HoKH;
        TenKH=kh1.TenKH;
        DienThoai=kh1.DienThoai;
        Diachi=kh1.Diachi;
    }
    public String getMaKH() {
        return MaKH;
    }
    public void setMaKH(String ma) {
        this.MaKH = ma;        
    }
    public String getTenKH() {
        return TenKH;
    }
    public void setTenKH(String ten) {
        this.TenKH = ten;        
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
        System.out.print("Nhap ma khach hang: ");
        MaKH= sc.nextLine();
        System.out.print("Nhap ho khach hang: ");
        HoKH= sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        TenKH= sc.nextLine();
        System.out.print("Nhap so dien thoai khach hang: ");
        DienThoai= sc.nextLine();
        System.out.print("Nhap dia chi khach hang: ");
        Diachi= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma khach hang: "+MaKH+" Ho va ten: "+HoKH+" "+TenKH+" So dien thoai: "+DienThoai+" Dia chi: "+Diachi);
    }


}
