package Hai_Dang_BT_Tuan_8;

public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String monHoc) {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.10;
    }

    @Override
    public String toString() {
        return "[Giao trinh] " + super.toString() + ", Mon hoc: " + monHoc +
               ", Gia ban: " + tinhGiaBan();
    }
}

