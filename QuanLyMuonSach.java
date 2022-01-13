package ITSOL.KeThua_DongGoi;

import java.util.Scanner;

public class QuanLyMuonSach extends Sach{
        BanDoc banDoc;
        Sach[] saches = new Sach[10];

        private int demDauSach(Sach[] saches, String chuyenNganhSach) {
            int dem = 0;

            for(int i = 0; i < saches.length && saches[i] != null; i++) {
                if (saches[i].getChuyenNganh().equals(chuyenNganhSach)) {
                    ++dem;
                }
            }

            return dem;
        }

        public Sach timKiemTheoMaSach(Sach[] saches,int maSach) {
            for(int i = 0; i < saches.length && saches[i] != null; i++)
            {
                if (saches[i].getMaSach() == maSach) {
                    return saches[i];
                }
            }
            return null;
        }

        public void themSachMuon(Sach sach)
        {
            for(int i = 0; i < 10; ++i) {
                if (this.saches[i] == null) {
                    this.saches[i] = sach;
                    break;
                }
            }

        }

        public void muonsach(BanDoc banDoc, Sach[] sachesss) {
            Scanner sc = new Scanner(System.in);
            this.banDoc = banDoc;
            System.out.println("Nhập số lượng sách mà bạn đọc có mã BĐ là " + banDoc.getMaBD() + " muốn mượn: ");
            int sl = sc.nextInt();
            if(sl >5)
            {
                System.out.println("Mượn quá số sách!");
            }
            else
            {

                int stt = 1;

                for(int i = 0; i < sl; ++i)
                {
                    if (this.saches[this.saches.length - 1] != null) {
                        System.out.println("Tối đa");
                        break;
                    }

                         while(i<sl)
                        {
                            System.out.println("Nhập mã sách thứ " + stt + ":");
                            int maSach = sc.nextInt();
                            if (this.timKiemTheoMaSach(sachesss, maSach) == null) {
                                System.out.println("Không tồn tại sách nào có mã sách là "+maSach+"!\nNhập lại mã sách hợp lệ!");
                            } else {
                                ++stt;
                                Sach b = this.timKiemTheoMaSach(sachesss, maSach);
                                if (this.demDauSach(this.saches, b.getChuyenNganh()) <3) {
                                    this.themSachMuon(b);
                                    i++;
                                    continue;
                                }

                                System.out.println("qua so luong sach cua 1 dau sach, hay chon sach khac");
                                --stt;
                            }
                        }

                    }
            }
        }

        public void hienThi() {
            System.out.println("Ban doc " + this.banDoc.getMaBD() + " da muon cac sach:");

            for(int i = 0; i < this.saches.length && this.saches[i] != null; ++i) {
                System.out.print("\t");
                System.out.println(this.saches[i].toString());
            }

        }

}
