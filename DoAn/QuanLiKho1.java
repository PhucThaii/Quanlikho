package DoAn;

import java.util.Scanner;

public class QuanLiKho1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args []) {
        DSKhachHang ds = new DSKhachHang();
        DSNhaCungCap ds1 = new DSNhaCungCap();
        ds.nhap();
        ds.xoa();    
        ds.xuat();
    }
}