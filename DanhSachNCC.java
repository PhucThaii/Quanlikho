import java.util.Scanner;
import java.util.Arrays;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
public class DanhSachNCC extends NCC
{
    static int n;
    NCC[] dsncc =new NCC[n];
    Scanner in=new Scanner(System.in);
    public void nhap()
    {
        System.out.print("moi nhap so luong nha cung cap:");
        
        n=in.nextInt();
        in.nextLine();
        dsncc =new NCC[n];

        for(int i=0;i<n;i++)
        {
            try
            {
                DataOutputStream outStream= new DataOutputStream(new FileOutputStream("ncc/ncc.txt", true));
                if(i==0)
                {
                    String nn= Integer.toString(n);
                    outStream.writeUTF(nn);
                }
                dsncc[i]=new NCC();
                dsncc[i].nhap();
                dsncc[i].ghiFile();
                outStream.close();
    
            }catch (Exception e){}
        }
    }

    public void xuat()
    {
       System.out.println("<================DANH SACH NHA CUNG CAP================>");
        for(int i=0;i<n;i++)
        {
            System.out.println("NHA CUNG CAP "+(i+1)+":");
            dsncc[i].xuat();
        }
        
    }

    public void ghiFile()
    {
        try
        {
            DataOutputStream outStream= new DataOutputStream(new FileOutputStream("src/ncc.txt"));
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    String nn= Integer.toString(n);
                    outStream.writeUTF(nn);
                }
                dsncc[i].ghiFile();
            }
            outStream.close();

        }catch (Exception e){}
    }

    public void docFile()
    {
        int i=0;
        try
        {
            DataInputStream inStream = new DataInputStream(new FileInputStream("src/ncc.txt"));
            String nn=inStream.readUTF();
            n=Integer.parseInt(nn);
            try
            {
                while(true)
                {
                    dsncc=Arrays.copyOf(dsncc,n+1);
                    String mancc=inStream.readUTF();
                    String tenncc=inStream.readUTF();
                    String sdt=inStream.readUTF();
                    String diachi=inStream.readUTF();
                    dsncc[i]=new NCC(mancc,tenncc,sdt,diachi);
                    dsncc[i].xuat();
                    i++;
                    if(i==n)
                    break;
                }
            }catch(EOFException e){}
            finally
            {
                n=i;
                inStream.close();
            }
        }catch (IOException e){}
    }

    public void them()
    {
        n=dsncc.length;
        dsncc = Arrays.copyOf(dsncc,n+1);
        dsncc[n]=new NCC();
        System.out.println("Nhap thong tin nha cung cap can them! ");
        dsncc[n].nhap();
        n++;
        System.out.println("Them hoan tat!");
    
        
        ghiFile();
    }

    public void sua()
    { 
        int flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang can sua: ");
        String temp= sc.nextLine();
        for(int i=0;i<n;i++){
            if(dsncc[i].getMancc().equals(temp)){
                dsncc[i].nhap();
                flag=1;
            }
        }
        if(flag ==0 ) System.out.println("Khong tim thay!!");

        ghiFile();
    }

    public void xoa()
    {
        System.out.print(" moi nhap nha cung cap can xoa: ");
        String mancc=in.nextLine();
        int t=0;
        int t2;
        do
        {
            t2=0;
            if(mancc=="")
            {
                t2=1;
                System.out.println("ma nha cung cap khong hop le");
                System.out.print("moi nhap lai ma nha cung cap:");
                mancc=in.nextLine();
            }
        }while(t2==1);
         for(int i=0;i<n;i++)
        {
            if(mancc.equals(dsncc[i].getMancc()))
            {
                for(int j=i;j<n-1;j++)
                {
                    dsncc[j]=dsncc[j+1];
                }
                t=1;
                n--;
            }
        }
        if(t==0)
        {
            System.out.print("khong tim thay! \n");
        }   
        ghiFile();
    }

    public void timkiem()
    {
  
        System.out.print("Nhap ma nha cung cap can tim: ");
        String mancc=in.nextLine();
        int t3,t=0;
        do
        {
            t3=0;
            if(mancc=="")
            {
                t3=1;
                System.out.println("ma nha cung cap khong hop le");
                System.out.print("moi nhap lai ma nha cung cap:");
                mancc=in.nextLine();
            }
        }while(t3==1);
        for(int i=0;i<n;i++)
        {
            if(mancc.equals(dsncc[i].getMancc()))
            {
                System.out.println("\n Day la thong tin nha cung cap: ");
                            dsncc[i].xuat();
                            t=1;
            }
        }
        if (t==0)
            System.out.println("NO INFORMATION");
            
    }
          
}     
  
 