package Bai1_Module1;

public class NgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgay;
	
	public NgoaiThanh() {
	}
	
	public NgoaiThanh(int ma, String tenTX, String soXe, long doanhThu, String noiDen, int soNgay) {
		super(ma, tenTX, soXe, doanhThu);
		this.noiDen=noiDen;
		this.soNgay=soNgay;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	@Override
	public String toString() {
		String s=super.toString();
		s+=String.format("Noi den: %s, So ngay: %s", this.noiDen, this.soNgay);
		return s;
	}
	
	
}
