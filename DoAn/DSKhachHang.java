package DoAn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DSKhachHang{
    static Scanner sc = new Scanner(System.in);
     int n;
    KhachHang[] dskh=new KhachHang[n];
    public DSKhachHang(){};
    public DSKhachHang(int nn,KhachHang[] dskh1){
        this.n=nn;
        this.dskh=dskh1;
    }
    public void nhap(){
        System.out.print("Nhap vao so khach hang: ");
        n=sc.nextInt();
        dskh=new KhachHang[n];
        for(int i=0; i<n; i++){
            System.out.println("Khach hang thu: "+(i+1));
            dskh[i]=new KhachHang();
            dskh[i].nhap();
        }
    }
    public void xuat(){
        for(int i=0; i<n; i++)
            dskh[i].xuat();
    }
    public void them(){
        n=dskh.length;
        dskh = Arrays.copyOf(dskh, n+1);
        dskh[n]=new KhachHang();
        System.out.println("Nhap thong tin khach hang can them!");
        dskh[n].nhap();
        n++;
    }
    public void them(KhachHang x) {
        n=dskh.length;
        dskh= Arrays.copyOf(dskh, n+1);
        dskh[n]=new KhachHang(x);
        n++;
    }
    public void timkiem(){
        System.out.println("\t\t\t\t*******************************\t\t\t\t");
        System.out.println("\t\t\t\t*    1.Tim kiem theo MaKH     *\t\t\t\t");
        System.out.println("\t\t\t\t*    2.Tim kiem theo TenKH    *\t\t\t\t");
        System.out.println("\t\t\t\t*******************************\t\t\t\t");
        System.out.print("Moi nhap vao lua chon: ");
        int key=sc.nextInt();
        switch(key){
            case 1:
                int flag = 0;
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap ma khach hang can tim: ");
                String temp = sc.nextLine();
                for(int i=0;i<dskh.length;i++)
                {
                    if(dskh[i].getMaKH().equals(temp)){
                        dskh[i].xuat();
                        flag=1;
                    }
                }
                if(flag==0) System.out.println("Khong tim thay!!!!");
                break;
            case 2:
                int flag1 = 0;
                System.out.print("Nhap ten khach hang can tim: ");
                Scanner sc1 = new Scanner(System.in);
                String temp1 = sc1.nextLine();
                for(int i=0;i<dskh.length;i++)
                {
                    if(dskh[i].getTenKH().equalsIgnoreCase(temp1)){
                        dskh[i].xuat();
                        flag1=1;
                    }
                }
                if(flag1==0) System.out.println("Khong tim thay!!!!");
                break;
        }
    }
    /*public void timkiem(String ma){
        this.dskh[]=ma;
        for(int i=1; i<dskh.length; i++){
            if(dskh[i].getMaKH().equals(ma))
                dskh[i].xuat();
            else System.out.println("Khong tim thay!!!!");
        }
    }*/
    public void sua(){
        int flag = 0;
        System.out.print("Nhap ma khach hang can sua: ");
        String temp = sc.nextLine();
        for(int i=0; i<dskh.length; i++ ){
            if(dskh[i].getMaKH().equals(temp)){
                dskh[i].nhap();
                flag=1;
            }
        }
        if(flag==0) System.out.println("Khong tim thay!!!");
    }
    public void xoa(){
            System.out.print("Nhap ma khach hang can xoa: ");
            Scanner sc = new Scanner(System.in);
            String maKH= sc.nextLine();
            int flag = 0;
            for(int i = 0; i<n; i++){
                if(maKH.equals(dskh[i].getMaKH())){
                    for(int j=i; j<n-1; j++)
                        dskh[j]=dskh[j+1];
                    n--;
                    flag=1;
                }       
            }
            if(flag==0) System.out.println("Khong tim thay!!!");
            else System.out.println("Xoa thanh cong!!!!");         
    }
}
