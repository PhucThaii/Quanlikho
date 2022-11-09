package DoAn;

public class QuanLiKho {
    public static void main(String args[]) {
        NhanVien nv = new NhanVien();
        NhanVien nv1 = new NhanVien(nv);
        //nv1.xuat();
        //nv.setMaNV("hjhj312");
        //System.out.println(nv.getMaNV()); 
        //nv.setDienThoai("0914494977");
        //System.out.println(nv.getDienThoai());
        HangHoa hh = new HangHoa();
        //hh.xuat();
        KhachHang kh = new KhachHang();
        kh.setDienThoai("0914494977");
        kh.setTenKH("phuc");
        kh.xuat();
        Kho kho = new Kho();
        kho.setMaKho("hjhjhjhjhj");
        kho.xuat();
    }
}
