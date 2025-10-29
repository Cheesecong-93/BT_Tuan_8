

import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

    @Override
    public Sach timSachTheoTieuDe(String tieuDe) {
        for (Sach s : danhSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSachTheoTieuDe(String tieuDe) {
        Sach s = timSachTheoTieuDe(tieuDe);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("❌ Đã xóa sách: " + tieuDe);
        } else {
            System.out.println("⚠️ Không tìm thấy sách có tiêu đề: " + tieuDe);
        }
    }

    @Override
    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("📭 Danh sách sách hiện đang trống.");
        } else {
            System.out.println("\n===== DANH SÁCH TẤT CẢ SÁCH =====");
            for (Sach s : danhSach) {
                System.out.println(s.toString());
            }
        }
    }
}
