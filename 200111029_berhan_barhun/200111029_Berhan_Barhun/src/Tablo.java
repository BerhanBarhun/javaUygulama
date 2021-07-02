import java.util.Scanner;

public class Tablo {
  
	public Tablo() {
		Scanner scanner = new Scanner(System.in);
		
			String tablo = "+───────+───────+───────+\n"
			  		    +  "|       |       |       |\n"
			  		    +  "+───────+───────+───────+\n"
			  		    +  "|       |   X   |       |\n"
			  		    +  "+───────+───────+───────+\n"
			  		    +  "|       |       |       |\n"
			  		    +  "+───────+───────+-------+\n"
			  		    +  "                         \n";
	
			StringBuilder sb = new StringBuilder(tablo);
			System.out.println(tablo);
			while(tablo.indexOf('X')!=202) {
			char hareket = scanner.next().charAt(0);
				switch (hareket) {
				case 'd','D':
					if(tablo.indexOf('X')==46||tablo.indexOf('X')==98||tablo.indexOf('X')==150)
					{
						System.out.println("Sınırı geçemezsiniz!");
					}
					else 
					{
						sb.setCharAt(tablo.indexOf('X'),' ');
						sb.setCharAt(tablo.indexOf('X')+8,'X');
				        tablo = sb.toString();
					}
					break;
				case 's','S':
					if(tablo.indexOf('X')==134||tablo.indexOf('X')==142)
					{
						System.out.println("Sınırı geçemezsiniz!");
					}
					else 
					{
						sb.setCharAt(tablo.indexOf('X'),' ');
						sb.setCharAt(tablo.indexOf('X')+52,'X');
				        tablo = sb.toString();
					}
					break;
				case 'a','A':
					if(tablo.indexOf('X')==30 ||tablo.indexOf('X')==82 ||tablo.indexOf('X')==134)
					{
						System.out.println("Sınırı geçemezsiniz!");
					}
					else {
						sb.setCharAt(tablo.indexOf('X'),' ');
						sb.setCharAt(tablo.indexOf('X')-8,'X');
				        tablo = sb.toString();
					}
					break;
				case 'w','W':
					if(tablo.indexOf('X')==30 ||tablo.indexOf('X')==38 ||tablo.indexOf('X')==46)
					{
						System.out.println("Sınırı geçemezsiniz!");
					}
					else {
						sb.setCharAt(tablo.indexOf('X'),' ');
						sb.setCharAt(tablo.indexOf('X')-52,'X');
				        tablo = sb.toString();
					}
					break;
				
				default: System.out.println("Yanlış tuşlama yaptınız.\n");
			
			}
	        System.out.println("\n\n"+tablo+"\n\n\n\n\n");
	    }	
			System.out.println("Tablo uygulaması kapatılıyor!\n\n");
	}	
}

