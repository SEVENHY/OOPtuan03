package Bai12;
import java.time.LocalDate;
public class KTKH {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 6, 12);
		HocVien[] hv=new HocVien[5];
		hv[1]=new HocVien("Ten","Ben Tre","032322323");
		KhoaHoc kh=new KhoaHoc("TCC1",date,hv,9);
		System.out.println(kh);
	}
}
