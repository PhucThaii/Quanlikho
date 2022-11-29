package DoAn;

import java.util.Scanner;

public class QuanLyDSNCC {
    public void menu() {
        DSNhaCungCap ds1 = new DSNhaCungCap();
        int t=0;
        do{
        System.out.println("\t\t\t\t****************************************************\t\t\t\t");
        System.out.println("\t\t\t\t*        1.Nhap Thong tin Nha Cung Cap             *\t\t\t\t");
        System.out.println("\t\t\t\t*        2.Xuat thong tin Nha Cung Cap             *\t\t\t\t");
        System.out.println("\t\t\t\t*        3.Them thong tin Nha Cung Cap theo MaNCC  *\t\t\t\t");
        System.out.println("\t\t\t\t*        4.Sua thong tin Nha Cung Cap theo MaNCC   *\t\t\t\t");
        System.out.println("\t\t\t\t*        5.Xoa thong tin Nha Cung Cap theo MaNCC    *\t\t\t\t");
        System.out.println("\t\t\t\t*        6.Tim kiem thong tin Nha Cung Cap         *\t\t\t\t");
        System.out.println("\t\t\t\t*        7.Thoat                                   *\t\t\t\t ");
        System.out.println("\t\t\t\t****************************************************\t\t\t\t\t");
        System.out.print("Moi nhap vao lua chon: ");
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        switch (key) {
            case 1:
                ds1.nhap();
                break;
            case 2:
                ds1.xuat();
                break;
            case 3:
                ds1.them();
                break;
            case 4:
                ds1.sua();
                break;
            case 5:
                ds1.xoa();
                break;
            case 6:
                ds1.timkiem();
                break;
            case 7:
                t=1;
                break;
            default:
                System.out.println("Moi nhap lai!!!!");
                break;
            }
        }
        while(t==0);
        
    }
}

