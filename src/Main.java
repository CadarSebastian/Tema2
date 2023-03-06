
public class Main {

	public static void main(String[] args) {
		Birou Birou = new Birou(10,8,6);
		Sertar Sertar1 = new Sertar(Birou.getLatime()/2,Birou.getLungime()-1,Birou.getH()-2);
		Sertar Sertar2 = new Sertar(Birou.getLatime()/2,Birou.getLungime()-1,Birou.getH()-2);
		System.out.println(Birou.tipareste());
		System.out.println("Sertar1 " + Sertar1.tipareste());
		System.out.println("Sertar2 " + Sertar2.tipareste());
		
		
		
		
		
	}

}
