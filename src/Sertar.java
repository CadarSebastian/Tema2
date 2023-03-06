
public class Sertar {

	private int l, L, H;

	public Sertar(int l, int L, int H) {
		this.l = l;
		this.L = L;
		this.H = H;

	}

	public String tipareste() {
		return " " + l+" " + L+" " + H;
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
