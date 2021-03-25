import java.util.Scanner;

public class Test {
	private static Singer sarkicilar = new Singer();
	private static Scanner klavye= new Scanner(System.in);
	
	public static void islemleriBastir() {
		System.out.println("\t 0-��lemleri G�r�nt�le");
        System.out.println("\t 1-�ark�c�lar� G�r�nt�le");
        System.out.println("\t 2-�ark�c� Ekle");
        System.out.println("\t 3-�ark�c� G�ncelle");
        System.out.println("\t 4-�ark�c� Sil");
        System.out.println("\t 5-�ark�c� Ara");
        System.out.println("\t 6-Uygulamadan ��k");
        
	}
	
	public static void sarkiciGoruntule() {
		sarkicilar.sarkicilariBastir();
	}
	
	public static void sarkiciEkle() {
		System.out.println("Eklemek Istediginiz Sarkiciyi Girin:");
		String isim = klavye.nextLine();
		sarkicilar.SarkiciEkle(isim);
		
	}
	
	public static void sarkiciGuncelle() {
		System.out.println("G�ncellemek istedi�iniz pozisyon(1,2,3...)");
        
        int pozisyon = klavye.nextInt();
        klavye.nextLine();
        
        String yeni_isim = klavye.nextLine();
        
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon - 1);
        
	}
	
	public static void sil() {
        
        System.out.println("Silmek istedi�iniz pozisyon (1,2,3....)");
        
        int pozisyon = klavye.nextInt();
        
        sarkicilar.sarkici_sil(pozisyon-1);
        
        
    }
	
	public static void ara() {
        
        System.out.println("Aramak istedi�iniz �ark�c�:");
        
        String isim = klavye.nextLine();
        
        sarkicilar.sarkici_ara(isim);
        
        
    }
	
	public static void main(String[] args) {
		System.out.println("Sarkici Uygulamasina Hosgeldiniz!");
		islemleriBastir();
		boolean cikis = false;
		int islem;
		
		while(!cikis) {
            System.out.println("Bir i�lem se�iniz:");
            
            islem = klavye.nextInt();
            
            klavye.nextLine();
            
            switch(islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkiciGoruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan ��k�l�yor...");
                    break;
           
                
                
            }
	}
	
	}
}