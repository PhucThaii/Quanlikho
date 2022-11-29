package DoAn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DSKhachHang extends KhachHang{
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
        int flag =0;
        System.out.print("Nhap ma khach hang can tim: ");
        String temp= sc.nextLine();
        for(int i=0; i<dskh.length; i++){
            if(dskh[i].getMaKH().equals(temp)){
                dskh[i].xuat();
                flag=1;
            }
        }
        if(flag==0) System.out.println("Khong tim thay!!!!");
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
