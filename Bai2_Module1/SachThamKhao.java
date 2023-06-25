package Bai2_Module1;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;
	
	public SachThamKhao() {
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, long donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue=thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public double thanhTie() {
		double tien;
		tien=getSoLuong()*getDonGia();
		return tien;
	}

	@Override
	public String toString() {
		String s=super.toString();
		s+="SachThamKhao [thue=" + thue + "]";
		return super.toString();
	}
	
	
}
