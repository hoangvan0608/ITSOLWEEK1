package ITSOL.KeThua_DongGoi;

import java.util.Scanner;

public class BanDoc {
    private static int maBD = 10000;
    private String tenBD,diaChi,soDT;

    public void nhapBanDoc()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ tên bạn đọc: ");
        this.setTenBD(scanner.nextLine());
        System.out.println("Địa chỉ: ");
        this.setDiaChi(scanner.nextLine());
        System.out.println("Số điện thoại: ");
        this.setSoDT(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "tenBD='" + tenBD + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDT='" + soDT + '\'' +
                '}';
    }

    public BanDoc() {
        maBD++;
    }

    public  int getMaBD() {
        return maBD;
    }

    public  void setMaBD(int maBD) {
        BanDoc.maBD = maBD;
    }

    public String getTenBD() {
        return tenBD;
    }

    public void setTenBD(String tenBD) {
        this.tenBD = tenBD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }


}
