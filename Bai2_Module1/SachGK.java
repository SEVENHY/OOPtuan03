package Bai2_Module1;

import java.time.LocalDate;

public class SachGK extends Sach{
	private String tinhTrang;
	
	public SachGK() {
	}

	public SachGK(String maSach, LocalDate ngayNhap, long donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang=tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public double thanhTien() {
		double tien;
		if(tinhTrang=="moi")
			tien=getSoLuong()*getDonGia();
		else 
			tien=getSoLuong()*getDonGia()*0.5;
		return tien;
	}

	@Override
	public String toString() {
		String s=super.toString();
		s+="SachGK [tinhTrang=" + tinhTrang + "]";
		return s;
	}
	
	
}
