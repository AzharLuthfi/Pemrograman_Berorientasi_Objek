package pertemuan4;

public class StudentMain {
	public static void main(String[] args) {

        Student x = new Student();
        Student y = x;
        x.setNrp(1);
        y.setNrp(2);
        System.out.println(x.getNrp());
        Student z = new Student();
        z.setNrp(3);
        x = z;
        System.out.println(x.getNrp());
        System.out.println(y.getNrp());

    }
}
