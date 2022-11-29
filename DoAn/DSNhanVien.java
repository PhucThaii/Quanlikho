package DoAn;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner; 

public class DSNhanVien  extends NhanVien{   
    public static Scanner sc = new Scanner(System.in);
    NhanVien[] dsnv=new NhanVien[1];
    int n;
    public DSNhanVien() {};    
    public DSNhanVien (int nn,NhanVien[] dsnv1)
    {
        this.n=nn;
        this.dsnv=dsnv1;
    }
public void nhap()
{
    System.out.print("Nhap vao so nhan vien: ");
    n=sc.nextInt();
    dsnv=new NhanVien[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Nhan vien thu: "+(i+1));
        dsnv[i] = new NhanVien();
        dsnv[i].nhap();
    }
}
public void xuat()
{
    for(int i=0;i<n;i++)
    {
        dsnv[i].xuat();
    }
}
public void them()
{
    n=dsnv.length;
    dsnv = Arrays.copyOf(dsnv,n+1);
    dsnv[n]=new NhanVien();
    System.out.println("Nhap thong tin nhan vien can them: ");
    dsnv[n].nhap();
    n++;
}
public void them(NhanVien x)
{
    n=dsnv.length;
    dsnv=Arrays.copyOf(dsnv,n+1);
    dsnv[n]=new NhanVien(x);
    n++;
}
public void timkiem()
{
    int flag = 0;
    System.out.print("Nhap ma nhan vien can tim: ");
    String temp = sc.nextLine();
    for(int i=0;i<dsnv.length;i++)
    {
        if(dsnv[i].getMaNV().equals(temp)){
            dsnv[i].xuat();
            flag=1;
        }
    }
    if(flag==0) System.out.println("Khong tim thay!!!!");
}
public void sua()
{
    int flag = 0;
    System.out.print("Nhap ma nhan vien can sua: ");
    String temp = sc.nextLine();
    for(int i=0;i<dsnv.length;i++)
    {
        if(dsnv[i].getMaNV().equals(temp))
        {
             dsnv[i].nhap();
             flag=1;
        }
    }
    if(flag==0) System.out.println("Khong tim thay!!!");
}
public void xoa(){
    System.out.print("Nhap ma nhan vien can xoa: ");
    Scanner sc = new Scanner(System.in);
    String maKH= sc.nextLine();
    int flag = 0;
    for(int i = 0; i<n; i++){
        if(maKH.equals(dsnv[i].getMaNV())){
            for(int j=i; j<n-1; j++)
                dsnv[j]=dsnv[j+1];
            n--;
            flag=1;
        }       
    }
    if(flag==0) System.out.println("Khong tim thay!!!");
    else System.out.println("Xoa thanh cong!!!!");         
}
}