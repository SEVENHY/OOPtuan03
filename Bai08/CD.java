package Bai08;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBH;
	private float gia;
	
	public CD() {
	}
	
	public CD(int maCD, String tuaCD, int soBH, float gia) {
		setGia(gia);
		setMaCD(maCD);
		setSoBH(soBH);
		setTuaCD(tuaCD);
	}

	public int getMaCD() {
		return maCD;
	}


	public void setMaCD(int maCD) {
		if(maCD<=0)
			this.maCD=999999;
		else
			this.maCD = maCD;
	}


	public String getTuaCD() {
		return tuaCD;
	}


	public void setTuaCD(String tuaCD) {
		if(tuaCD=="")
			this.tuaCD="Chua xac dinh";
		else
			this.tuaCD = tuaCD;
	}


	public int getSoBH() {
		return soBH;
	}


	public void setSoBH(int soBH) {
		if(soBH <=0)
			this.soBH=1;
		else 
			this.soBH = soBH;
	}


	public float getGia() {
		return gia;
	}


	public void setGia(float gia) {
		if(gia<=0)
			this.gia=1000;
		else
			this.gia = gia;
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBH=" + soBH + ", gia=" + gia + "]";
	}
}