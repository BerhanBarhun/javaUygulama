import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zar {
	Scanner scanner = new Scanner(System.in);
	List<Integer> zar1Kayıt=new ArrayList<Integer>();
	List<Integer> zar2Kayıt=new ArrayList<Integer>();
	
	public Zar() {
		System.out.println("Zar oyununa hoş geldiniz!");
		int selection=-1;
		char selection3;

		
		while(selection!=0) {
		System.out.println("Lütfen seçiminizi yapınız:\n"
				+"1. 2 zar at.\n"
				+"2. Kayıt edilen tüm zar sonuçlarını listele.\n"
				+"0. Programdan çık.\n"
				+ "-------------------------------------\n");
		selection = scanner.nextInt();
		
		switch(selection) {
			case 1:
				do{
					int zar1=(int) (Math.random() * 6+1);
					int zar2=(int) (Math.random() * 6+1);
					System.out.println("İlk zar "+ zar1 +", ikinci zar " +zar2 +" geldi.");
					
					System.out.println("Sonuçları kaydetmek ister misiniz?[E/H] ");
					char selection2 = scanner.next().charAt(0);

					if (selection2=='E'||selection2=='e') {
						zar1Kayıt.add(zar1);
						zar2Kayıt.add(zar2);
					}
					System.out.println("Tekrar zarlamak ister misiniz?[E/H] ");
					selection3 = scanner.next().charAt(0);
					
				}while (selection3=='E'||selection3=='e');
				break;
			case 2:
				System.out.println("Kaydedilen zar 1 sonuçları: "+ Arrays.toString(zar1Kayıt.toArray()));
				System.out.println("Kaydedilen zar 2 sonuçları: "+ Arrays.toString(zar2Kayıt.toArray())+"\n");
				break;
			default: System.out.println("Yanlış bir seçim yaptınız!\n");
			}
		}
	}
}
