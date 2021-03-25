
public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Atat�rk Havaliman�'na Hosgeldiniz.");
		String sartlar = "Yurtd��� ��k�� Kurallar�...\n"
                +"Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekiyor...\n"
                +"15 Tl har� bedelinizi tam olarak yat�rman�z gerekiyor...\n"
                +"Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor...";
		String message = "Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor";
		
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
