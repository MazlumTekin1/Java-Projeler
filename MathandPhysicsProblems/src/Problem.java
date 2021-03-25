
public class Problem {
	public static class Maths {
		public static void daireAlan(int yaricap) {
			final double PI = Math.PI;
			System.out.println("Dairenin Alani: "+ (PI * yaricap * yaricap));
		}
		public static void CevreHesaplama(int kenar1, int kenar2, int kenar3) {
			System.out.println("Ucgenin Cevresi: " + (kenar1 + kenar2 +kenar3));
		}
	}
	
	public static class Physics{
		public static void VektorIcCarpim(Vector vec1, Vector vec2) {
			int icCarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
			System.out.println(vec1.getName() + " ile " + vec2.getName() + " in iç çarpýmý =  " + icCarpim);
		}
	}
}
