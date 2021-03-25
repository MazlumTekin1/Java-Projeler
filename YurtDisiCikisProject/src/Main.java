
public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Atatürk Havalimaný'na Hosgeldiniz.");
		String sartlar = "Yurtdýþý Çýkýþ Kurallarý...\n"
                +"Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekiyor...\n"
                +"15 Tl harç bedelinizi tam olarak yatýrmanýz gerekiyor...\n"
                +"Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor...";
		String message = "Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor";
		
		while(true) {
			System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            Yolcu yolcu = new Yolcu();
            System.out.println("Harc Bedeli Kontrol Ediliyor...");
            Thread.sleep(2000);
            if(yolcu.yurtdisiHarciKontrol() == false) {
            	System.out.println(message);
            	continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(2000);
            if(yolcu.siyasiYasakKontrol() == false) {
            	System.out.println(message);
            	continue;
            }
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(2000);
            if(yolcu.vizeDurumuKontrol() == false) {
            	System.out.println(message);
            	continue;
            }
            
            System.out.println("Gereken Sartlar Saglandi, Yurtdisina Cikabilirsiniz...");
            break;
		}
	}
}
