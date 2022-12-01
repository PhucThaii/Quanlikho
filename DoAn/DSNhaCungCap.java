package DoAn;

import java.util.Arrays;
import java.util.Scanner;

public class DSNhaCungCap extends NhaCungCap{
    static Scanner sc = new Scanner(System.in);
    NhaCungCap[] dscc;
    int n;
    public DSNhaCungCap(){};
    public DSNhaCungCap(int nn,NhaCungCap[] ds1){
        this.n=nn;
        this.dscc =ds1;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong nha cung cap: ");
        n= sc.nextInt();
        dscc =new NhaCungCap[n];
        for(int i=0; i<n; i++){
            System.out.println("Nha cung cap thu "+ (i+1));
            dscc[i]=new NhaCungCap();
            dscc[i].nhap();
        }
    }
    public void xuat(){
        for(int i=0; i<n; i++){
            dscc[i].xuat();
        }
    }
    public void them(){
        n=dscc.length;
        dscc= Arrays.copyOf(dscc,n+1);
        dscc[n]=new NhaCungCap();
        System.out.println("Nhap thong tin nha cung cap can them! ");
        dscc[n].nhap();
        n++;
        System.out.println("Them hoan tat!");
    }
    public void them(NhaCungCap x){
        n = dscc.length;
        dscc=Arrays.copyOf(dscc, n+1);
        dscc[n]=new NhaCungCap(x);
        n++;
    }
    public void timkiem(){
    System.out.println("\t\t\t\t******************************\t\t\t\t");
    System.out.println("\t\t\t\t*    1.Tim kiem theo MaNCC   *\t\t\t\t");
    System.out.println("\t\t\t\t*    2.Tim kiem theo TennCC  *\t\t\t\t");
    System.out.println("\t\t\t\t******************************\t\t\t\t");
    System.out.print("Moi nhap vao lua chon: ");
    
    int key=sc.nextInt();
    switch(key){
        case 1:
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ma nha cung cap can tim: ");
            String temp = sc.nextLine();
            for(int i=0;i<dscc.length;i++)
            {
                if(dscc[i].getMaNCC().equals(temp)){
                    dscc[i].xuat();
                    flag=1;
                }
            }
            if(flag==0) System.out.println("Khong tim thay!!!!");
            break;
        case 2:
            int flag1 = 0;
            System.out.print("Nhap ten nha cung cap can tim: ");
            Scanner sc1 = new Scanner(System.in);
            String temp1 = sc1.nextLine();
            for(int i=0;i<dscc.length;i++)
            {
                if(dscc[i].getTenNCC().equalsIgnoreCase(temp1)){
                    dscc[i].xuat();
                    flag1=1;
                }
            }
            if(flag1==0) System.out.println("Khong tim thay!!!!");
            break;
    }
    }

    public void sua(){
        int flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nha cung cap can sua: ");
        String temp = sc.nextLine();
        for(int i = 0; i<dscc.length; i++){
            if(dscc[i].getMaNCC().equalsIgnoreCase(temp)){
                dscc[i].nhap();
                flag=1;
            }
        }
        if(flag==0)System.out.println("Khong tim thay ma nha cung cap can sua");
    }
    public void xoa(){
        System.out.print("Nhap nha cung cap can xoa: ");
        Scanner sc = new Scanner(System.in);
        String maKH= sc.nextLine();
        int flag = 0;
        for(int i = 0; i<n; i++){
            if(maKH.equals(dscc[i].getMaNCC())){
                for(int j=i; j<n-1; j++)
                    dscc[j]=dscc[j+1];
                n--;
                flag=1;
            }       
        }
        if(flag==0) System.out.println("Khong tim thay!!!");
        else System.out.println("Xoa thanh cong!!!!");         
}
}
