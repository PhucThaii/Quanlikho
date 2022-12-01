package DoAn;

import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int t=0;
        do{
        System.out.println("\t\t\t\t****************************************************\t\t\t\t");
        System.out.println("\t\t\t\t*        1.Quan li danh sach khach hang            *\t\t\t\t");
        System.out.println("\t\t\t\t*        2.Quan li danh sach nhan vien             *\t\t\t\t");
        System.out.println("\t\t\t\t*        3.Quan li danh sach nha cung cap          *\t\t\t\t");
        System.out.println("\t\t\t\t*        4.                                        *\t\t\t\t");
        System.out.println("\t\t\t\t*        5.                                        *\t\t\t\t");
        System.out.println("\t\t\t\t*        6.                                        *\t\t\t\t");
        System.out.println("\t\t\t\t*        7.Thoat                                   *\t\t\t\t");
        System.out.println("\t\t\t\t****************************************************\t\t\t\t\t");
        System.out.print("Moi nhap vao lua chon: ");
        int key=sc.nextInt();
        switch (key) {
            case 1:
                QuanLyDSKH qldskh = new QuanLyDSKH();
                qldskh.menu();
                break;
            case 2:
                QuanLyDSNV qldsnv = new QuanLyDSNV();
                qldsnv.menu();
                break;
            case 3:
                QuanLyDSNCC qldsncc = new QuanLyDSNCC();
                qldsncc.menu();
                break;
            case 4:
                //ds1.sua();
                break;
            case 5:
                //ds1.xoa();
                break;
            case 6:
                //ds1.timkiem();
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
        
