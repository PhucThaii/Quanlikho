import java.util.Scanner;

import javax.crypto.Mac;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class NCC {
    private String mancc;
    private String tenncc;
    private String sdt;
    private String diachi;
    public NCC(){};
    public NCC(String mancc,String tenncc,String sdt,String diachi)
    {
        this.mancc=mancc;
        this.tenncc=tenncc;
        this.sdt= sdt;
        this.diachi= diachi;
    }
    public NCC(NCC ncc1)
    {
        this.mancc=ncc1.mancc;
        this.tenncc=ncc1.tenncc;
        this.sdt=ncc1.sdt;
        this.diachi=ncc1.diachi;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nha cung cap: ");
        mancc= sc.nextLine();
        System.out.print("Nhap ten nha cung cap: ");
        tenncc= sc.nextLine();
        System.out.print("Nhap so dien thoai nha cung cap: ");
        sdt= sc.nextLine();
        System.out.print("Nhap dia chi nha cung cap: ");
        diachi= sc.nextLine();
    }    

    
    public void xuat()
    {
        System.out.println("ma nha cung cap : "+mancc+" ten nha cung cap:"+tenncc+" so dien thoai nha cung cap:"+sdt+" dia chi nha cung cap:"+diachi);
    }

    public void ghiFile()
    {
        try
        {
            DataOutputStream outStream =new DataOutputStream(new FileOutputStream("src/ncc.txt", true));
            outStream.writeUTF(mancc);
            outStream.writeUTF(tenncc);
            outStream.writeUTF(sdt);
            outStream.writeUTF(diachi);
            outStream.close();

        }catch (Exception e){}
    }
    public String getMancc()
    {
        return mancc;
    }
    public String getTenncc()
    {
        return tenncc;
    }
    public String getSdt()
    {
        return sdt;
    }
    public String getDiachi()
    {
        return diachi;
    }
    public void setMancc(String mancc)
    {
        this.mancc=mancc;
    }
    public void setTenncc(String tenncc)
    {
        this.tenncc=tenncc;
    }
    public void setSdt(String sdt)
    {
        this.sdt=sdt;
    }
    public void setDiachi(String diachi)
    {
        this.diachi=diachi;
    }
}
