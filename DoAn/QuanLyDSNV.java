package DoAn;
import java.util.Scanner;
public class QuanLyDSNV {
    
        public void menu() {
            DSNhanVien ds = new DSNhanVien();
            int n=0;
            do{
            System.out.println("\t\t\t\t****************************************************\t\t\t\t");
            System.out.println("\t\t\t\t*        1.Nhap Thong tin Nhan vien                *\t\t\t\t");
            System.out.println("\t\t\t\t*        2.Xuat thong tin Nhan vien                *\t\t\t\t");
            System.out.println("\t\t\t\t*        3.Them thong tin Nhan vien theo MaNV      *\t\t\t\t");
            System.out.println("\t\t\t\t*        4.Sua thong tin Nhan vien theo MaNV       *\t\t\t\t");
            System.out.println("\t\t\t\t*        5.Xoa thong tin Nhan vien theo MaNV       *\t\t\t\t");
            System.out.println("\t\t\t\t*        6.Tim kiem thong tin Nhan vien theo MaNV  *\t\t\t\t");
            System.out.println("\t\t\t\t*        7.Thoat                                   *\t\t\t\t ");
            System.out.println("\t\t\t\t****************************************************\t\t\t\t\t");
            System.out.print("Moi nhap vao lua chon: ");
            Scanner sc = new Scanner(System.in);
            int key=sc.nextInt();
            switch (key) {
                case 1:
                    ds.nhap();
                    break;
                case 2:
                    ds.xuat();
                    break;
                case 3:
                    ds.them();
                    break;
                case 4:
                    ds.sua();
                    break;
                case 5:
                    ds.xoa();
                    break;
                case 6:
                    ds.timkiem();
                    break;
                case 7:
                    n=1;
                    break;
                default:
                    System.out.println("Moi nhap lai!!!!");
                    break;
                }
            }
            while(n==0);
            
        }
    }
