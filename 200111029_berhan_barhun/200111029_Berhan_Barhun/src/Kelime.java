import java.util.Scanner;

public class Kelime {

	public Kelime() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelimeyi giriniz: ");
		String kelime = scanner.nextLine();
		int selection;
		int count=0;
		do {
		System.out.println("1. " + kelime +" kelimesi içinde belirtilen harfin karşılaşılan ilk yerini bulma."
				+ "\n2. " + kelime +" kelimesi içinde belirtilen harfin karşılaşılan son yerini bulma."
				+ "\n3. "+kelime+" kelimesi içinde belirtilen harften kaç adet olduğunu bulma."
				+ "\n4. "+kelime+" kelimesinin x-y arasındaki parçasını yazdırma."
				+ "\n0. Programı kapat.\n");
		selection = scanner.nextInt();
		if (selection==1) {
				System.out.println("Harfi giriniz: ");
				char harf = scanner.next().charAt(0);
				System.out.println(kelime.indexOf(harf)+1+"\n----------------------------------------\n");
				}
		if (selection==2) {
			System.out.println("Harfi giriniz: ");
			char harf = scanner.next().charAt(0);
			System.out.println(kelime.lastIndexOf(harf)+1+"\n----------------------------------------\n");
			}
		if (selection==3) {
			System.out.println("Harfi giriniz: ");
			char harf = scanner.next().charAt(0);
			for (int i = 0; i < kelime.length(); i++) {
			    if (kelime.charAt(i) == harf) {
			        count++;
			    }
			}System.out.println(count+"\n----------------------------------------\n");
			}
		if (selection==4) {
			System.out.println("X index değerini giriniz: ");
			int indexX = scanner.nextInt();

			System.out.println("Y index değerini giriniz: ");
			int indexY = scanner.nextInt();
			
			if(indexY==0) {
				System.out.println(kelime.substring(indexX,kelime.length()));}	
			else {
			System.out.println(kelime.substring(indexX,indexY));
		}	
		}
			}while(selection != 0);
		System.out.println("Program kapatılıyor.");
	}
}
