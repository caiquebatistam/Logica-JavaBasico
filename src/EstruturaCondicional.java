import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		int hora;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Que horas são ? ");
		hora = scan.nextInt();
		
		if (hora < 12)
		{
			System.out.println("Boa dia");
		}
		else if(hora >= 12 && hora < 19)
			{
				System.out.println("Boa tarde");
			}
		else
		System.out.println("Boa noite");
		
	}

}
