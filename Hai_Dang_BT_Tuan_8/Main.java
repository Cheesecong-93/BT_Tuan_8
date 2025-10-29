package Hai_Dang_BT_Tuan_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 0) break;

            switch (ch) {
                case 1:
                    System.out.print("Ma: "); String ma1 = sc.nextLine();
                    System.out.print("Tieu de: "); String td1 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg1 = sc.nextLine();
                    System.out.print("Gia co ban: "); double gia1 = sc.nextDouble();
                    System.out.print("SL: "); int sl1 = sc.nextInt(); sc.nextLine();
                    System.out.print("Vi tri: "); String vt1 = sc.nextLine();
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma1, td1, tg1, gia1, sl1, vt1, mh));
                    break;

                case 2:
                    System.out.print("Ma: "); String ma2 = sc.nextLine();
                    System.out.print("Tieu de: "); String td2 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg2 = sc.nextLine();
                    System.out.print("Gia co ban: "); double gia2 = sc.nextDouble();
                    System.out.print("SL: "); int sl2 = sc.nextInt(); sc.nextLine();
                    System.out.print("Vi tri: "); String vt2 = sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    quanLy.themSach(new SachTieuThuyet(ma2, td2, tg2, gia2, sl2, vt2, tl));
                    break;

                case 3:
                    System.out.print("Nhap ma sach: ");
                    String maTK = sc.nextLine();
                    Sach kq = quanLy.timKiemSach(maTK);
                    System.out.println(kq == null ? "Khong tim thay!" : kq);
                    break;

                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    String maX = sc.nextLine();
                    System.out.println(quanLy.xoaSach(maX) ? "Xoa thanh cong!" : "Khong tim thay!");
                    break;

                case 5:
                    quanLy.hienThiDanhSach();
                    break;

                default: System.out.println("Sai lua chon!");
            }
        }
    }
}
