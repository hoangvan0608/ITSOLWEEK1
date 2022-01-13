package ITSOL.KeThua_DongGoi;

public class SinhVien extends BanDoc{
    private int maBD = super.getMaBD();
    private String loaiBD = "Sinh viên";


    @Override
    public int getMaBD() {
        return maBD;
    }

    @Override
    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public String getLoaiBD() {
        return loaiBD;
    }

    public void setLoaiBD(String loaiBD) {
        this.loaiBD = loaiBD;
    }

    @Override
    public String toString() {
        return "{" +
                "maBD ='" + maBD + '\'' +
                "tenBD='" + this.getTenBD() + '\'' +
                "diaChi='" + this.getDiaChi() + '\'' +
                "soDT='" + this.getSoDT() + '\'' +
                "loaiBD='" + loaiBD + '\'' +
                '}';
    }
}
