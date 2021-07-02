import java.util.Scanner;

public class Hesap {

	Scanner scanner = new Scanner(System.in);
	public void dIslem(){
		double a,b,answer;
	    char x;

	    System.out.println("Hesap makinesi(+, -, /, x)\n(karakterler arasında boşluk kullanınız, örn. 2 + 2): ");
	    a = scanner.nextDouble();
	    x = scanner.next().charAt(0);
	    b = scanner.nextDouble();
	    switch(x) {
	        case '+':
		        answer=a+b;
		        System.out.println(a +" + "+ b + " = " + answer+"\n---------------------------------------------------------------------");
	        break;
	        
	        case '-':
			    answer=a-b;
		        System.out.println(a +" - "+ b + " = " + answer+"\n---------------------------------------------------------------------");
	        break;
	        
	        case '/':
		        answer=a/b;
		        System.out.println(a +" / "+ b + " = " + answer+"\n---------------------------------------------------------------------");
	        break;
	        
	        case 'x':
			    answer=a*b;
		        System.out.println(a +" x "+ b + " = " + answer+"\n---------------------------------------------------------------------");
	        break;

	        default:
	        System.out.println("Yanlış işlem yaptınız lütfen tekrar deneyin!");
	    }
	}
	
	public void kare() {
		double a;
		System.out.println("Karekökünü hesaplamak istediğini sayıyı giriniz: ");
		   a = scanner.nextDouble();

		double answer=Math.sqrt(a);
		System.out.println("\n"+a+" sayısının karekökü: "+answer+"\n---------------------------------\n");
	}
	
	public void küp() {
		double a;
		System.out.println("Karekökünü hesaplamak istediğini sayıyı giriniz: ");
		   a = scanner.nextDouble();

		double answer=Math.pow(a,1.0/3);
		System.out.println("\n"+a+" sayısının küpkökü: "+answer+"\n---------------------------------\n");
	}
	
	public void kuvvet() {
		double a,b;
		System.out.println("Lütfen ilk önce sayıyı ardından kaçıncı kuvvetini öğrenmek istediğinizi giriniz: ");
		   a = scanner.nextDouble();
		   b = scanner.nextDouble();
		   
		double answer=Math.pow(a,b);
		System.out.println("\n"+a+" sayısının "+b+". kuvveti: "+answer+"\n---------------------------------\n");
	}
	
	public void fakt() {
		double answer = 1;
		
		System.out.println("Faktöriyelini öğrenmek istediğiniz sayıyı giriniz: ");
		double n = scanner.nextDouble();
		
	    for (double i = n; i > 1; i--)
	    {
	        answer = i * answer;
	    }
	    System.out.println(n+" faktöriyel: "+answer+"\n------------------------------------------------");
	    
	}
	
	public Hesap() {

		int selection = -1;
		while(selection!=0) {
			System.out.println("1. 4 işlem menüsü.\n"
					+"2. Karekök alma.\n"
					+"3. Küpkök alma.\n"
					+"4. Kuvvet öğrenme.\n"
					+"5. Faktöriyel hesaplama\n"
					+"0. Programı kapat.\n"
					+ "------------------------------------------------");
			selection = scanner.nextInt();
			switch (selection) {
			case 0:
				System.out.println("Program kapatılıyor.");
				break;
			case 1:
				System.out.println("4 işlem menüsünü seçtiniz.\n");
				dIslem();
				break;
				
			case 2:
				System.out.println("Karekök hesaplamayı seçtiniz.\n");
				kare();
				break;
				
			case 3:
				System.out.println("Küpkök hesaplamayı seçtiniz.\n");
				küp();
				break;
			case 4:
				System.out.println("Kuvvet almayı seçtiniz.\n");
				kuvvet();
				break;
			case 5:
				System.out.println("Faktöriyel hesaplamayı seçtiniz.\n");
				fakt();
				break;
			default:
				System.out.println("Yanlış bir seçim yaptınız!");
			}	
		}}

}