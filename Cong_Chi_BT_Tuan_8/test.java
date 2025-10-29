import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n====== MENU QUAN LY SACH ======");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap mon hoc: ");
                    String mh = sc.nextLine();
                    System.out.print("Nhap cap do: ");
                    String cd = sc.nextLine();

                    ql.themSach(new SachGiaoTrinh(mh, cd, ma, td, tg, nam, sl, gia));
                    break;

                case 2:
                    System.out.print("Nhap ma sach: ");
                    ma = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    tg = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    nam = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap so luong: ");
                    sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap gia co ban: ");
                    gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap the loai: ");
                    String tl = sc.nextLine();
                    System.out.print("Co phai sach series (true/false): ");
                    boolean series = Boolean.parseBoolean(sc.nextLine());

                    ql.themSach(new SachTieuThuyet(tl, series, ma, td, tg, nam, sl, gia));
                    break;

                case 3:
                    ql.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    ma = sc.nextLine();
                    Sach s = ql.timKiemSach(ma);
                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Khong tim thay sach!");
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    ma = sc.nextLine();
                    ql.xoaSach(ma);
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
        sc.close();
    }
}
