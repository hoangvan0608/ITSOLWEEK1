package ITSOL.KeThua_DongGoi;

public class KHTNSach extends Sach {
    private int maSach = super.getMaSach();
    private String chuyenNganh = "Khoa Học Tự nhiên";

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
    public KHTNSach(){

    }
    public KHTNSach(String bookName, String author, int year){
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
