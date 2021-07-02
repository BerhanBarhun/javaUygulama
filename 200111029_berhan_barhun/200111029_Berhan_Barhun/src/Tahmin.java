import java.util.Scanner;

public class Tahmin {

	public Tahmin() {
		System.out.println("Tahmin oyunu başlıyor.");
		
		String[] isimler=new String[] {"speedwagon","zeppeli","joestar","dio","kira","rohan","giorno","polnareff","kakyoin","gappy"};
		
		String random_isim=isimler[(int) (Math.random() * isimler.length)];
		
		char[] harfler = new char[random_isim.length()];
			
			for (int i = 0; i < harfler.length; i++) {
				harfler[i]='_';
			}
		
		Scanner scanner = new Scanner(System.in);
		
		int kalanDeneme = 5;
		
		while (kalanDeneme > 0) {
		System.out.print("Kalan deneme hakkı: "+kalanDeneme+"\n\n");	
		System.out.println("Tahmin: ");
		
		String input = scanner.nextLine();
		input = input.toLowerCase();
		char harf = input.charAt(0);
		
		
		boolean tahminDY=false;
		
		for (int i = 0; i < random_isim.length(); i++) {
			char h = random_isim.charAt(i);
		
			if(h == harf) {
				harfler[i]=h;
				tahminDY=true;
			}
		}
		if(!tahminDY) {
			kalanDeneme--;
			}
		
		boolean oyunBitti=true;
		
		System.out.print("Kelime: ");
		for (int i = 0; i < harfler.length; i++) {
		if(harfler[i]=='_') {
			oyunBitti=false;
		}
		System.out.print(harfler[i]+" \n");
		}
	
		System.out.println("-------------------------------------");
		
		if(oyunBitti) {
			System.out.println("Tebrikler, doğru tahmin!");
			break;
		}
		
		if(kalanDeneme==0) {
			System.out.println("Kaybettin!\nDoğru cevap "+random_isim+" olacaktı.");
		}
		
		
		
		}
		System.out.println("Oyundan çıkılıyor.");
	}
}
