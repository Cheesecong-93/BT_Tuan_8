/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sachhhh;

/**
 *
 * @author ASUS
 */


public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String monHoc) {
        super(tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    // Ghi đè phương thức tính giá bán
    @Override
    public double tinhGiaBan() {
        // Giá bán = giá cơ bản + 10%
        return giaCoBan * 1.1;
    }

    // Ghi đè phương thức kiểm tra tồn kho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    // Ghi đè phương thức cập nhật vị trí
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Giáo trình] " + super.toString() + ", Môn học: " + monHoc +
               ", Giá bán: " + tinhGiaBan();
    }
}
