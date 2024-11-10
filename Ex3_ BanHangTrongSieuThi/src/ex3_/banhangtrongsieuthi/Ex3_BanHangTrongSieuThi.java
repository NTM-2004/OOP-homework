package ex3_.banhangtrongsieuthi;

import java.util.ArrayList;

public class Ex3_BanHangTrongSieuThi {

    public static void main(String[] args) {
        KhachHang k1 = new KhachHang("Ha Noi", 1001, "Nguyen Van A");
        ArrayList<MatHang> KhoHang = new ArrayList<>();
        MatHang x = new MatHang(13.5f, 1, 10, "X");
        MatHang y = new MatHang(17.8f, 2, 20, "Y");
        MatHang z = new MatHang(26.7f, 3, 24, "Z");
        KhoHang.add(x);
        KhoHang.add(y);
        KhoHang.add(z);
        HoaDon HoaDonCuaKhachA = new HoaDon(1001, k1, "3/11/2024", 0.0f);
        MatHangMua sp1 = new MatHangMua(HoaDonCuaKhachA, 1, x, 5);
        MatHangMua sp2 = new MatHangMua(HoaDonCuaKhachA, 2, y, 6);
        HoaDonCuaKhachA.ThemHoaDon(sp1);
        HoaDonCuaKhachA.ThemHoaDon(sp2);
        HoaDonCuaKhachA.InHoaDon();
    }
    
}
