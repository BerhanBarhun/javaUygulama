import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int selection = -1;
		while(selection!=0) {
			System.out.println("1. Tablo uygulaması\n"
					+"2. Kelime tahmini uygulaması\n"
					+"3. Kelimenin içinde harf uygulaması\n"
					+"4. Kütüphane uygulaması\n"
					+"5. Zar uygulaması\n"
					+"6. Hesap uygulaması\n"
					+"0. Programı kapat.\n"
					+ "------------------------------------------------------");
			selection = scanner.nextInt();
			switch (selection) {
			case 0:
				System.out.println("Program kapatılıyor.");
				break;
			case 1:
				System.out.println("Tablo uygulamasını seçtiniz.");
				new Tablo();
				break;
				
			case 2:
				System.out.println("Kelime tahmini uygulamasını seçtiniz.");
				new Tahmin();
				break;
				
			case 3:
				System.out.println("Kelimenin içinde harf uygulamasını seçtiniz.");
				new Kelime();
				break;
			case 4:
				System.out.println("Kütüphane uygulamasını seçtiniz.");
				new Kütüphane();
				break;
			case 5:
				System.out.println("Zar uygulamasını seçtiniz.");
				new Zar();
				break;
			case 6:
				System.out.println("Hesap uygulamasını seçtiniz.");
				new Hesap();
				break;
			default:
				System.out.println("Yanlış bir seçim yaptınız!");
			}
		}
		
	}

}
