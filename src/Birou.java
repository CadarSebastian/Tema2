
public class Birou {
	
	private int l, L, H;
	Sertar Sertar1 = new Sertar(0,0,0);
	Sertar Sertar2 = new Sertar(0,0,0);
	
	public Birou( int l, int L, int H) {
		this.l = l;
		this.L = L;
		this.H = H;
	}
	public String  tipareste() {
		return  "Birou " + l+" " + L+" " + H;
	}

	public int getLatime() {
		return l;
	}

	public void setLatime(int l) {
		this.l = l;
	}

	public int getLungime() {
		return L;
	}

	public void setLungime(int l) {
		L = l;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

}