package Hai_Dang_BT_Tuan_8;

import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> ds = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        ds.add(s);
        System.out.println(">>> Da them sach thanh cong!");
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : ds) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            ds.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            for (Sach s : ds) {
                System.out.println(s);
            }
        }
    }
}
