package pertemuan5;

public class Matakuliah {
	  private String kode;
	  private String nama;
	  private String index;
	  private int sks;
	 
	  //CONSTRUKTOR
	  public Matakuliah(String kode, String nama, String index, int sks) {
	    super();
	    this.kode = kode;
	    this.nama = nama;
	    this.index = index;
	    this.sks = sks;
	  }
	  
	  public int getSks() {
	    return sks;
	  }
	  
	  public double nilaiIndex() {
	      if (index == "A") {
	          return 4.0;
	      } else if (index == "AB") {
	          return 3.5;
	      } else if (index == "B") {
	          return 3.0;
	      } else if (index == "BC") {
	          return 2.5;
	      } else if (index == "C") {
	          return 2.0;
	      } else if (index == "D") {
	          return 1.5;
	      } else if (index == "E") {
	          return 1;
	      } else {
	          return 0.0;
	      }
	  }

	  public String Display() {
	    return kode + " - " + nama + " - " + index;
	  }
}
