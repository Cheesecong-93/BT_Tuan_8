

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        int chon;
        do {
            System.out.println("\n====== MENU QUẢN LÝ SÁCH ======");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị tất cả sách");
            System.out.println("4. Tìm sách theo tiêu đề");
            System.out.println("5. Xóa sách theo tiêu đề");
            System.out.println("0. Thoát");
            System.out.print("👉 Nhập lựa chọn: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (chon) {
                case 1 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập môn học: ");
                    String mon = sc.nextLine();
                    System.out.print("Nhập cấp độ: ");
                    String cd = sc.nextLine();

                    Sach s = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mon, cd);
                    quanLy.themSach(s);
                }

                case 2 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Có phải sách series không (true/false): ");
                    boolean series = sc.nextBoolean();

                    Sach s = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, series);
                    quanLy.themSach(s);
                }

                case 3 -> quanLy.hienThiTatCa();

                case 4 -> {
                    System.out.print("Nhập tiêu đề cần tìm: ");
                    String td = sc.nextLine();
                    Sach s = quanLy.timSachTheoTieuDe(td);
                    if (s != null)
                        System.out.println("🔍 Tìm thấy: " + s);
                    else
                        System.out.println("⚠️ Không tìm thấy sách có tiêu đề \"" + td + "\"");
                }

                case 5 -> {
                    System.out.print("Nhập tiêu đề cần xóa: ");
                    String td = sc.nextLine();
                    quanLy.xoaSachTheoTieuDe(td);
                }

                case 0 -> System.out.println("👋 Thoát chương trình!");
                default -> System.out.println("⚠️ Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
