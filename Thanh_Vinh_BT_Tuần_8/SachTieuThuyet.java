/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sachhhh;

/**
 *
 * @author ASUS
 */


public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String theLoai) {
        super(tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        // Giá bán = giá cơ bản + 20%
        return giaCoBan * 1.2;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Tiểu thuyết] " + super.toString() + ", Thể loại: " + theLoai +
               ", Giá bán: " + tinhGiaBan();
    }
}
