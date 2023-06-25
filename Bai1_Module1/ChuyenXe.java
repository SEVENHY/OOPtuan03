package Bai1_Module1;

public class ChuyenXe {
	private int ma;
	private String tenTX;
	private String soXe;
	private long doanhThu;
	
	public ChuyenXe() {
		// TODO Auto-generated constructor stub
	}
	
	public ChuyenXe(int ma, String tenTX, String soXe, long doanhThu) {
		this.ma = ma;
		this.tenTX = tenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTenTX() {
		return tenTX;
	}

	public void setTenTX(String tenTX) {
		this.tenTX = tenTX;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public long getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(long doanhThu) {
		this.doanhThu = doanhThu;
	}

	@Override
    public String toString() {
        return String.format("\nMa so chuyen xe: %d\nHo ten tai xe: %s\nSo xe: %s\nDoanh thu: %.2f\n", this.ma, this.tenTX, this.soXe, this.doanhThu);
    }
	
}
