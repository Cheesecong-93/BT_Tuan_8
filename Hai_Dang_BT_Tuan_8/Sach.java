package Hai_Dang_BT_Tuan_8;

public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private double giaCoBan;
    private int soLuong;
    private String viTri;

    public Sach(String maSach, String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Da chuyen sach '" + tieuDe + "' den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Ma: " + maSach + ", Tieu de: " + tieuDe + ", Tac gia: " + tacGia +
               ", Gia co ban: " + giaCoBan + ", SL: " + soLuong + ", Vi tri: " + viTri;
    }
}

