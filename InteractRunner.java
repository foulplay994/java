import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String lastResult=null;						// последний результат
			String lastCheck="0";					 	// проверка последнего результата
			String exit = "no";							// переменная для выхода
			while (!exit.equals("yes")) {
				String first, second = "";
				
				System.out.println("Use last result? Type Y to accept : ");   // первый аргумент
				lastCheck = reader.next();
				if(lastCheck.equals("y")) {
					System.out.println("Last result was taken like first arg ");    
					 System.out.println("It was " + lastResult);	
						first=lastResult;											// первый аргумент по последнему результату
					System.out.println("Enter second arg : ");	// второй аргумент
				second = reader.next(); }
				
				else {
				System.out.println("Enter first arg : ");   // первый аргумент
				first = reader.next();						 
				System.out.println("Enter second arg : ");	// второй аргумент
				second = reader.next(); }
				System.out.println("Enter type : add dec x part sqt. Default is add");  // список действий
				String ctype = reader.next(); 
				
				if(ctype.equals("1")) {												// условия выбора действия
				calc.add(Double.valueOf(first), Double.valueOf(second)); }
				else if(ctype.equals("2")) {	
				calc.dec(Double.valueOf(first), Double.valueOf(second)); }
				else if(ctype.equals("3")) {
				calc.x(Double.valueOf(first), Double.valueOf(second)); }
				else if(ctype.equals("4")) {	
				calc.part(Double.valueOf(first), Double.valueOf(second)); }
				else if(ctype.equals("5")) {	
				calc.sqt(Double.valueOf(first), Double.valueOf(second)); }
						
				System.out.println("Result : " + calc.getResult());
				lastResult = String.valueOf(calc.getResult());						// запись последнего результата
				calc.cleanResult(); ctype = "";
				System.out.println("Exit : yes / no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}