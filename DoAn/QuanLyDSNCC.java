import java.util.Scanner;
import java.util.Arrays;
public class QuanLyDSNCC {
    DanhSachNCC ds1=new DanhSachNCC();
    void menu()
    {
        
        int t=0;
        do
        {
            System.out.println("\t\t\t\t****************************************************\t\t\t\t");
            System.out.println("\t\t\t\t*        1.Xem danh sach nha cung cap              *\t\t\t\t");
            System.out.println("\t\t\t\t*        2.Them thong tin nha cung cap             *\t\t\t\t");
            System.out.println("\t\t\t\t*        3.Xoa thong tin nha cung cap theo MaNCC   *\t\t\t\t");
            System.out.println("\t\t\t\t*        4.Sua thong tin nha cung cap theo MaNCC   *\t\t\t\t");
            System.out.println("\t\t\t\t*        5.Tim kiem thong tin nha cung cap         *\t\t\t\t");
            //System.out.println("6.thong ke");
            System.out.println("\t\t\t\t*        7.Ghi File                                *\t\t\t\t");
            System.out.println("\t\t\t\t*        8.Doc File                                *\t\t\t\t");
            System.out.println("\t\t\t\t*        9.Thoat                                   *\t\t\t\t");
            System.out.println("\t\t\t\t****************************************************\t\t\t\t");
            Scanner in = new Scanner(System.in);
            System.out.print("moi ban lua chon :");
            int chon=in.nextInt();
            in.nextLine();
            switch(chon)
            {
                case 1:
                {
                    System.out.println("1.xem danh sach nha cung cap");
                    ds1.xuat();
                    break;
                }
                case 2:
                {
                    System.out.println("2.them nha cung cap");
                    ds1.them();
                    break;
                }
                case 3:
                {
                    System.out.println("3.xoa nha cung cap");
                    ds1.xoa();
                    break;
                }
                case 4:
                {
                    System.out.println("4.sua thong tin nha cung cap");
                    ds1.sua();
                    break;
                }
                case 5:
                {
                    System.out.println("5.tim kiem ");
                    ds1.timkiem();
                    break;
                }
                /*case 6:
                {
                    System.out.println("6.thong ke");
                    ds1.thongke();
                    break;
                }
                */
               
                case 7:
                {
                    System.out.println("8.ghi file");
                    ds1.ghiFile();
                    break;
                }
                case 8:
                {
                    System.out.println("9.doc file");
                    ds1.docFile();
                    break;
                }
                case 9:
                {
                    System.out.println("7.thoat");
                    t=1;
                    break;
                }

            }
        }while(t==0);
        

    }
}
