package pertemuan5;

public class GelasMain {
	public static void main(String[] args) {
	    Gelas g1 = new Gelas("hitam");
	    Gelas g2 = new Gelas("putih");


	    tukarWarna(g1, g2);
	    System.out.println("warna g1 " + g1.getWarna());
	    System.out.println("warna g2 "+ g2.getWarna());
	  }

	  static void tukarWarna(Gelas g1, Gelas g2) {

		Gelas gTemp = new Gelas("temp");
	    gTemp.setWarna(g1.getWarna());
	    g1.setWarna(g2.getWarna());
	    g2.setWarna(gTemp.getWarna());

	  }
}
