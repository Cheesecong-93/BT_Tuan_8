
public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        // Tính giá bán theo cấp độ
        double giaBan = getGiaCoBan();
        if (capDo.equalsIgnoreCase("Đại học")) {
            giaBan += 10000;
        } else if (capDo.equalsIgnoreCase("Cao đẳng")) {
            giaBan += 5000;
        }
        return giaBan;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + getTieuDe() + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Môn học: " + monHoc +
               ", Cấp độ: " + capDo +
               ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
