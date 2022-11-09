package DoAn;

import java.util.Scanner;

public class HangHoa {
    private String MaHang, TenHang, GiaBan, GiaMua, DonViTinh ;
    private int SoLuong;
    public HangHoa(){}
    public HangHoa(String ma, String ten, String giamua, String giaban, String dv, int sl ){
        this.MaHang=ma;
        this.TenHang=ten;
        this.GiaBan=giaban;
        this.GiaMua=giamua;
        this.DonViTinh=dv;
        this.SoLuong=sl;
    }
    public HangHoa(HangHoa hh1){
        MaHang=hh1.MaHang;
        TenHang=hh1.TenHang;
        GiaBan=hh1.GiaBan;
        GiaMua=hh1.GiaMua;
        DonViTinh=hh1.DonViTinh;
        SoLuong=hh1.SoLuong;
    }
    public String getMaHang() {
        return MaHang;
    }
    public void setMaHang(String ma) {
        this.MaHang = ma;        
    }
    public String getTenHang() {
        return TenHang;
    }
    public void setTenNC(String ten) {
        this.TenHang = ten;        
    }
    public String getGiaBan(){
        return GiaBan;
    }
    public void setGiaBan(String giaban){
        this.GiaBan=giaban;
    }
    public String getGiaMua(){
        return GiaMua;
    }
    public void setGiaMua(String giamua){
        this.GiaMua=giamua;
    }
    public String getDonViTinh(){
        return DonViTinh;
    }
    public void setDonViTinh(String dv){
        this.DonViTinh=dv;
    }
    public int getSoluong(){
        return SoLuong;
    }
    public void setSoLuong(int sl){
        this.SoLuong=sl;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma hang:");
        MaHang = sc.nextLine();
        System.out.println("Nhap vao ten hang:");
        TenHang = sc.nextLine();
        System.out.println("Nhap vao gia ban:");
        GiaBan = sc.nextLine();
        System.out.println("Nhap vao gia mua:");
        GiaMua = sc.nextLine();
        System.out.println("Nhap vao don vi tinh:");
        DonViTinh = sc.nextLine();
        System.out.println("Nhap vao so luong:");
        SoLuong = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ma hang: "+MaHang+" Ten Hang: "+TenHang+" Gia ban: "+GiaBan+" Gia mua: "+GiaMua+" Don vi tinh: "+DonViTinh+" So luong: "+SoLuong);
    }
}
