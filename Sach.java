package ITSOL.KeThua_DongGoi;

import java.util.Scanner;

public  class Sach {
    private static int maSach = 1000;
    private String tenSach, tacGia, chuyenNganh;



    private int namXB;

    public Sach()
    {
        maSach++;
    }
    public void nhapSach()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sách: ");
        System.out.println("Tên Sách: ");
        this.setTenSach(scanner.nextLine());
        System.out.println("Tác giả: ");
        this.setTacGia(scanner.nextLine());
        System.out.println("Năm xuất bản: ");
        this.setNamXB(scanner.nextInt());
        scanner.nextLine();

    }

    @Override
    public String toString() {
        return "Book{" +
                "tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", namXB=" + namXB +
                '}';
    }
    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    public  int getMaSach() {
        return maSach;
    }

    public static void setMaSach(int maSach) {
        Sach.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }



    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
