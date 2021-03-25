import java.util.Scanner;
public class Main {
	public static void  main(String args[]) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Matematik ve Fizik Problemleri Programýna Hoþgeldiniz...");
        
        String islemler = "Ýþlemler...\n"
                          + "1. Daire Alaný Hesaplama\n"
                          + "2. Üçgen Çevresi Hesaplama\n"
                          + "3. 2 Vektörün Ýç Çarpýmýný Hesaplama\n"
                          + "Çýkýþ :  q";
        System.out.println(islemler);
        while(true) {
        	
        	System.out.print("Islem Seciniz: ");
        	String islem = klavye.nextLine();
        	
        	if(islem.equals("q")) {
        		System.out.println("Programdan Cikiliyor...");
        	}
        	else if(islem.equals("1")) {
        		
        		System.out.print("Yaricapi Giriniz: ");
        		int yaricap = klavye.nextInt();
        		klavye.nextLine();
        		Problem.Maths.daireAlan(yaricap);
        	}
        	else if(islem.equals("2")) {
        		System.out.print("Kenarlari Giriniz: ");
        		System.out.print("Kenar1:");
        		int kenar1 = klavye.nextInt();
        		System.out.print("Kenar2:");
        		int kenar2 = klavye.nextInt();
        		System.out.print("Kenar3:");
        		int kenar3 = klavye.nextInt();
        		klavye.nextLine();
        		Problem.Maths.CevreHesaplama(kenar1, kenar2, kenar3);
        	}
        	else if(islem.equals("3")) {
        		Vector vektor1 = new Vector("Vektor1");
        		Vector vektor2 = new Vector("Vektor2");
        		Problem.Physics.VektorIcCarpim(vektor1, vektor2);
        	}
        	else {
        		System.out.println("Gecersiz Islem!");
        	}
        }
        
	}
}
