package ITSOL.KeThua_DongGoi;

import java.util.Scanner;

public class QuanLyThuVien {
    static Scanner scanner = new Scanner(System.in);
    BanDoc banDocs[] = new BanDoc[100];
    Sach sachs[] = new Sach[100];

    public void themMoiBanDoc()
    {
        System.out.println("Nhập số bạn đọc: ");
        int n = scanner.nextInt();
        int i = 0;
        while (banDocs[i]!=null){
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Lựa chọn loại bạn đọc:");
            System.out.println("1: Sinh viên");
            System.out.println("2: Cao học");
            System.out.println("3: Giáo viên");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    banDocs[i] = new SinhVien();
                    banDocs[i].nhapBanDoc();
                    i++;
                    break;
                case 2:
                    banDocs[i] = new CaoHoc();
                    banDocs[i].nhapBanDoc();
                    i++;
                    break;
                case 3:
                    banDocs[i] = new GiaoVien();
                    banDocs[i].nhapBanDoc();
                    i++;
                    break;
            }
        }
    }
    public void hienThiBanDoc()
    {
        System.out.println("Danh sách bạn đọc: ");
        for (int i = 0; i < banDocs.length; i++) {
            if(banDocs[i] != null)
                System.out.println((i+1) +"\t"+banDocs[i].toString());
        }
    }

    public void themMoiSach()
    {
        System.out.println("Nhập số đầu sách: ");
        int n = scanner.nextInt();
        int i = 0;
        while (sachs[i]!=null){
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Lựa chọn chuyên ngành sách muốn thêm:");
            System.out.println("1: CNTT");
            System.out.println("2: KHTN");
            System.out.println("3: VHNT");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    sachs[i] = new CNTTSach();
                    sachs[i].nhapSach();
                    i++;
                    break;
                case 2:
                    sachs[i] = new KHTNSach();
                    sachs[i].nhapSach();
                    i++;
                    break;
                case 3:
                    sachs[i] = new VHNTSach();
                    sachs[i].nhapSach();
                    i++;
                    break;
            }
        }
    }
    public void hienThiSach()
    {
        System.out.println("Danh sách các quyển sách đã có tại thư viện: ");
        for (int i = 0; i < sachs.length; i++) {
            if(sachs[i] != null)
                System.out.println((i+1) +"\n"+sachs[i].toString());
        }
    }


}
