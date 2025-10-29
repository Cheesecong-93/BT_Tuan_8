/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sachhhh;

/**
 *
 * @author ASUS
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String td1 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double gia1 = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int sl1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String vt1 = sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();

                    quanLy.themSach(new SachGiaoTrinh(td1, tg1, gia1, sl1, vt1, mh));
                    break;

                case 2:
                    System.out.print("Nhập tiêu đề: ");
                    String td2 = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double gia2 = sc.nextDouble();
                    System.out.print("Số lượng: ");
                    int sl2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vị trí: ");
                    String vt2 = sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();

                    quanLy.themSach(new SachTieuThuyet(td2, tg2, gia2, sl2, vt2, tl));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập tiêu đề cần tìm: ");
                    String tim = sc.nextLine();
                    Sach s = quanLy.timKiemSach(tim);
                    if (s != null)
                        System.out.println("Tìm thấy: " + s);
                    else
                        System.out.println("Không tìm thấy sách!");
                    break;

                case 5:
                    System.out.print("Nhập tiêu đề cần xóa: ");
                    String xoa = sc.nextLine();
                    if (!quanLy.xoaSach(xoa))
                        System.out.println("Không tìm thấy để xóa!");
                    break;

                case 0:
                    System.out.println("Thoát chương trình...");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

