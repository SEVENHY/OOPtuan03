package Bai12;

import java.time.LocalDate;
import java.util.Arrays;
public class KhoaHoc {
	private String name;
	private LocalDate date;
	private int time;
	private HocVien hocVien[];
	
	public KhoaHoc() {
	}

	public KhoaHoc(String name, LocalDate date, HocVien[] hocVien, int time) {
		this.name = name;
		this.date = date;
		this.time =time;
		this.hocVien = hocVien;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public HocVien[] getHocVien() {
		return hocVien;
	}

	public void setHocVien(HocVien[] hocVien) {
		this.hocVien = hocVien;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "KhoaHoc [name=" + name + ", date=" + date + ", time=" + time + ", hocVien=" + Arrays.toString(hocVien)
				+ "]";
	}
}
