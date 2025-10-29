/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sachhhh;


import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSachSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSachSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) {
        Sach sach = timKiemSach(tieuDe);
        if (sach != null) {
            danhSachSach.remove(sach);
            System.out.println("Đã xóa sách: " + tieuDe);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("=== DANH SÁCH SÁCH ===");
        for (Sach s : danhSachSach) {
            System.out.println(s);
        }
    }
}

