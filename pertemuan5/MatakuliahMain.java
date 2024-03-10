package pertemuan5;

public class MatakuliahMain {
	  public static void main(String[] args) {
		  	
		   //CREATE OBJEK MATAKULIAH
		    Matakuliah mk1 = new Matakuliah("001", "Alpro 1", "A", 3);
		    Matakuliah mk2 = new Matakuliah("002", "Alpro 2", "BC", 3);
		    Matakuliah mk3 = new Matakuliah("003", "pemrograman berorientasi objek 1", "B", 3);
		    
		    // TAMPILKAN DAFTAR MATAKULIAH
		    System.out.println("---DAFTAR MATKUL---");
		    System.out.println(mk1.Display());
		    System.out.println(mk2.Display());
		    System.out.println(mk3.Display());

		    System.out.println("---NILAI IPK---");
		    double ipk = (  mk1.nilaiIndex() * mk1.getSks() + mk2.nilaiIndex() * mk2.getSks() + 
		    				mk3.nilaiIndex() * mk3.getSks()) / (double) (mk1.getSks() + mk2.getSks() + mk3.getSks()
		    			  );
		    System.out.println("IPK: " + ipk);
		  }
		}


	

