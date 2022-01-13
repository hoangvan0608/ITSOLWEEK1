package ITSOL.KeThua_DongGoi;

public class CNTTSach extends Sach {
    private int maSach = super.getMaSach();
    private String chuyenNganh = "Công nghệ thông tin";

    @Override
    public int getMaSach() {
        return maSach;
    }

    @Override
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    @Override
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public CNTTSach(){

    }
    public CNTTSach(String bookName, String author, int year){
        this.setTenSach(bookName);
        this.setTacGia(author);
        this.setNamXB(year);
    }

    @Override
    public String toString() {
        return "Mã sách='" + maSach+ '\'' +
                ", Tên sách='" + this.getTenSach() + '\'' +
                ", Tác giả='" + this.getTacGia() + '\'' +
                ", chuyên ngành='" + this.getChuyenNganh() + '\'' +
                ", năm=" + this.getNamXB();
    }

}
