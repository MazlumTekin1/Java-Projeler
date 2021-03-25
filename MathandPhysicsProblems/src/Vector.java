import java.util.Scanner;
public class Vector {
	private int j;
	private int k;
	private int i;
	private	String name;
	
	public Vector(String name) {
		this.name = name;
		Scanner klavye = new Scanner(System.in);
		
		System.out.println(name + " 'in i,j ve k degerlerini giriniz:");
		System.out.print("i: ");
		this.i = klavye.nextInt();
		System.out.print("j: ");
		this.j = klavye.nextInt();
		System.out.print("k: ");
		this.k = klavye.nextInt();

		
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
