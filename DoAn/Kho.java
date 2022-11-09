package DoAn;

import java.util.Scanner;

public class Kho {
    private String MaKho, TenKho, DienThoai, Diachi;
    public Kho(){}
    public Kho(String ma, String ten, String sdt, String dc ){
        this.MaKho=ma;
        this.TenKho=ten;
        this.DienThoai=sdt;
        this.Diachi=dc;
    }
    public Kho(Kho kho1){
        MaKho=kho1.MaKho;
        TenKho=kho1.TenKho;
        DienThoai=kho1.DienThoai;
        Diachi=kho1.Diachi;
    }
    public String getMaKho() {
        return MaKho;
    }
    public void setMaKho(String ma) {
        this.MaKho = ma;        
    }
    public String getTenKho() {
        return TenKho;
    }
    public void setTenNC(String ten) {
        this.TenKho = ten;        
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
        System.out.print("Nhap ma kho: ");
        MaKho= sc.nextLine();
        System.out.print("Nhap ten kho: ");
        TenKho= sc.nextLine();
        System.out.print("Nhap so dien thoai kho: ");
        DienThoai= sc.nextLine();
        System.out.print("Nhap dia chi kho: ");
        Diachi= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma kho: "+MaKho+" ten kho: "+TenKho+" So dien thoai: "+DienThoai+" Dia chi: "+Diachi);
    }
}
