import java.util.Scanner;
import easyIO.*;

public class Oppgave3 {

	public static void main(String[] args) {
		userInput();
	}
	
	public static void userInput(){
		int sec = 0;
		Scanner sc = new Scanner(System.in);

		try {
			while(true){
				System.out.print("Skriv inn antall sekund: ");
				sec = sc.nextInt();
				System.out.print(time_convert(sec));
			}

		} catch(java.util.InputMismatchException ex) {
			//System.err.print("Exited with InputMismatchException\n");
			System.out.print("Program avsluttet.\n");
		} finally{
			sc.close();
		}
	}

	public static String time_convert(int sec){
		/*
		 * Finn ein finare måte vha. modulo
		 * */
		int hour = sec / 3600;
		int min = (sec / 60) - (hour * 60);
		sec = sec - (min * 60) - (hour * 3600);
		
		return hour + " timer, " + min + " minutt, " + sec + " sekund\n";
	}

}
