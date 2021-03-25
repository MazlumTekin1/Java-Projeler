import java.util.ArrayList;
public class Singer {
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();
	
	public void sarkicilariBastir() {
		System.out.println("Sarkici Listesinde "+ sarkiciListesi.size()+ " kadar sarkici var.");
		for(int i = 0 ; i < sarkiciListesi.size();i++) {
			System.out.println((i+1) + ". Sarkici: " + sarkiciListesi.get(i));
		}
	}
	public void SarkiciEkle(String isim) {
		sarkiciListesi.add(isim);
		System.out.println("�ark�c� Listesi G�ncellendi...");
    
	}
	
	public void sarkici_guncelle(String yeni_isim,int pozisyon) {
        
        sarkiciListesi.set(pozisyon, yeni_isim);
        
        System.out.println("�ark�c� Listesi G�ncellendi...");
    }
	public void sarkici_sil(int pozisyon) {
        
        String isim = sarkiciListesi.get(pozisyon);
        
        sarkiciListesi.remove(pozisyon);
        
        System.out.println(isim + " isimli �ark�c� listeden silindi...");
       
    }
	
public void sarkici_ara(String sarkici_ismi) {
        
        int pozisyon = sarkiciListesi.indexOf(sarkici_ismi);
        
        if (pozisyon >= 0) {
            System.out.println("�ark�c� Bulundu.");
            System.out.println(sarkici_ismi + " isimli �ark�c� " + (pozisyon+1) + ". pozisyonda");
            
        }
        else {
            System.out.println("�ark�c� Bulunamad�...");

        }
    }
	
}

