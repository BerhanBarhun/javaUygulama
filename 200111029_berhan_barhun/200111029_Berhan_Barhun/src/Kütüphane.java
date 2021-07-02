import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kütüphane {
	public Kütüphane() {		
		Scanner scanner = new Scanner(System.in);
			int selection=-1;
			int kırmızı=14;
			int yeşil=14;
			int mavi=14;
			
			while(selection!=0) {
				System.out.println("1. Kitapların sırasıyla kırmızı, yeşil, mavi etiketli olarak dizilişi.\n"
						+ "2. Kitapların eşit sayıda olmak üzere sırasıyla önce kırmızı, sonra yeşil, en son ise mavi etiketli olarak dizilişi.\n"
						+ "0. Programdan çık.");
				selection = scanner.nextInt();
				
				
				List<String> kırmızıArr=new ArrayList<String>();
				List<String> yeşilArr=new ArrayList<String>();
				List<String> maviArr=new ArrayList<String>();
				
				
				for (int i = 0; i < kırmızı; i++) {
					kırmızıArr.add("k"+(i+1));
				}
				for (int i = 0; i < yeşil; i++) {
					yeşilArr.add("y"+(i+1));
				}
				for (int i = 0; i < mavi; i++) {
					maviArr.add("m"+(i+1));
				}
				
				Collections.shuffle(kırmızıArr);
				Collections.shuffle(yeşilArr);
				Collections.shuffle(maviArr);

				switch(selection) {
				case 1:
					
					for (int i = 0; i < 14 ; i++) {
						System.out.println(kırmızıArr.get(i)+", "
								+yeşilArr.get(i)+", "
								+maviArr.get(i)+", ");
					}
					break;
	 			case 2:
					
					for (int i = 0; i < kırmızıArr.size() ; i++) {
						System.out.println(kırmızıArr.get(i)+", ");
					}
					for (int i = 0; i < yeşilArr.size() ; i++) {
						System.out.println(yeşilArr.get(i)+", ");
					}
					for (int i = 0; i < maviArr.size() ; i++) {
						System.out.println(maviArr.get(i)+", ");
					}
					break;
				default: System.out.println("Yanlış bir seçim yaptınız.");
				
				}
			}
		}
	}

