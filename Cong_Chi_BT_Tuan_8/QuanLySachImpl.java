import java.util.*;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach))
                return s;
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (Sach s : danhSach) {
            System.out.println("------------------------");
            System.out.println(s);
        }
    }

    @Override
    public void capNhatSach(String maSach, double giaMoi, int soLuongMoi) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            s.setGiaCoBan(giaMoi);
            s.setSoLuong(soLuongMoi);
            System.out.println("Da cap nhat thong tin sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    @Override
    public void thongKe() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        for (Sach s : danhSach) {
            tongSoLuong += s.getSoLuong();
            tongGiaTri += s.getSoLuong() * s.getGiaCoBan();
        }
        System.out.println("Tong so sach: " + tongSoLuong);
        System.out.println("Tong gia tri kho: " + tongGiaTri + " VND");
    }

    @Override
    public void sapXepTheoGia() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        danhSach.sort((a, b) -> Double.compare(a.tinhGiaBan(), b.tinhGiaBan()));
        System.out.println("Da sap xep danh sach theo gia ban tang dan.");
    }
}
