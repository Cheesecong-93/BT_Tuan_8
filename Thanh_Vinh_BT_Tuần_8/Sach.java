/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sachhhh;

/**
 *
 * @author ASUS
 */


public abstract class Sach implements IGiaBan, IKiemKe {
    protected String tieuDe;
    protected String tacGia;
    protected double giaCoBan;
    protected int soLuong;
    protected String viTri;

    public Sach(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // Getters & Setters
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
    public String toString() {
        return "Tiêu đề: " + tieuDe + ", Tác giả: " + tacGia + 
               ", Giá cơ bản: " + giaCoBan + ", Số lượng: " + soLuong + ", Vị trí: " + viTri;
    }
}

