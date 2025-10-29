package Hai_Dang_BT_Tuan_8;

public class SachTieuThuyet extends Sach {
 private String theLoai;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String theLoai) {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.20;
    }

    @Override
    public String toString() {
        return "[Tieu thuyet] " + super.toString() + ", The loai: " + theLoai +
               ", Gia ban: " + tinhGiaBan();
    }
}
