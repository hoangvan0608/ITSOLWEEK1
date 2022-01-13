package ITSOL.KeThua_DongGoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyThuVien ql = new QuanLyThuVien();
        QuanLyMuonSach[] muonSaches = new QuanLyMuonSach[10];
        int luaChon = -100;
        do {
            menu();
            System.out.print("Lựa chọn của bạn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    ql.themMoiBanDoc();
                    break;
                case 2:
                    ql.hienThiBanDoc();
                    break;
                case 3:
                    ql.themMoiSach();
                    break;
                case 4:
                    ql.hienThiSach();
                    break;
                case 5:
                    if (ql.sachs[0] == null && ql.banDocs[0] == null) {
                        System.out.println("Vui lòng thêm sách và bạn đọc trước khi lập danh sách!");
                        break;
                    }
                    for (int i = 0; i < ql.banDocs.length && ql.banDocs[i] !=null; i++ ) {
                        muonSaches[i] = new QuanLyMuonSach();
                        muonSaches[i].muonsach(ql.banDocs[i], ql.sachs);
                    }

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    for (int i = 0; i < muonSaches.length && muonSaches[i] != null; i++) {
                        muonSaches[i].hienThi();
                    }
                    break;
                default:break;
            }
        } while (luaChon != 0);
    }

    public static void menu() {
        System.out.println("=========================================");
        System.out.println("Lựa chọn các chức năng sau");
        System.out.println("1. Thêm bạn đọc");
        System.out.println("2. Hiển thị danh sách bạn đọc");
        System.out.println("3. Thêm sách");
        System.out.println("4. Hiển thị danh sách sách");
        System.out.println("5. Lập danh sách mượn sách");
        System.out.println("6. Sắp xếp danh sách  mượn sách");
        System.out.println("0. Exit");
        System.out.println("=========================================");
    }
}
