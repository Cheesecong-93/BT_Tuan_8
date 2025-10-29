public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() { super(); }

    public SachTieuThuyet(String theLoai, boolean laSachSeries, String maSach,
                          String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nThe loai: " + theLoai +
            "\nLa sach series: " + (laSachSeries ? "Co" : "Khong") +
            "\nGia ban: " + tinhGiaBan();
    }
}
