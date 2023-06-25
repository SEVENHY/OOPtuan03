package Bai2_Module1;

import java.time.LocalDate;
public class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private long donGia;
	private int soLuong;
	private String nhaXuatBan;
	
	public Sach() {
	}
	
	public Sach(String maSach, LocalDate ngayNhap, long donGia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	@Override
	public String toString() {
		return String.format("\nMa sach: %s, ngay nhap: %s, don gia: %l, so luong: %d, nha xuat ban: %s",this.maSach,this.ngayNhap,this.donGia,this.soLuong,this.nhaXuatBan);
	}
	
}
