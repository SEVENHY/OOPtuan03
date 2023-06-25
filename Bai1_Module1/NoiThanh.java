package Bai1_Module1;

public class NoiThanh extends ChuyenXe{
	private int soTuyen;
	private int soKm;
	
	public NoiThanh() {
	}
	
	public NoiThanh(int ma, String tenTX, String soXe, long doanhThu, int soTuyen, int soKm) {
		super(ma, tenTX, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKm() {
		return soKm;
	}

	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	
	@Override
    public String toString() {
        String s = super.toString();
        s += String.format("\nSo tuyen: %s\nSo km: %d\n", this.soTuyen, this.soKm);
        return s;
    }
    
}
