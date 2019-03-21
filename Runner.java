import java.util.Scanner;

public class Runner {

public static String first, second, lastCheck="no", lastResult="0";
	// первый и второй аргумент, проверка последнего результата, последний результат
	
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";		
			while (!exit.equals("yes")) {
				
				
				System.out.println("Use last result? Type Y to accept : ");   // первый аргумент
				lastCheck = reader.next();
				if(lastCheck.equals("y")) {
					System.out.println("Last result was taken like first arg ");    
					 System.out.println("It was " + lastResult);	
					  first=lastResult;									// первый аргумент по последнему результату
					System.out.println("Enter second arg : ");	// второй аргумент
				second = reader.next(); }
				
				else {
				System.out.println("Enter first arg : ");   // первый аргумент
				first = reader.next();						 
				System.out.println("Enter second arg : ");	// второй аргумент
				second = reader.next(); }
				System.out.println("Enter type : 1)add  2)dec  3)x  4)part  5)sqt ");  // список действий
				String runType = reader.next(); 
				
				if(runType.equals("1")) {												// условия выбора действия
				calc.add(Double.valueOf(first), Double.valueOf(second)); }
				else if(runType.equals("2")) {	
				calc.dec(Double.valueOf(first), Double.valueOf(second)); }
				else if(runType.equals("3")) {
				calc.x(Double.valueOf(first), Double.valueOf(second)); }
				else if(runType.equals("4")) {	
				calc.part(Double.valueOf(first), Double.valueOf(second)); }
				else if(runType.equals("5")) {	
				calc.sqt(Double.valueOf(first), Double.valueOf(second)); }
						
				PrintNClean();
						
				System.out.println("Result : " + calc.getResult());					
				lastResult = String.valueOf(calc.getResult());						// запись последнего результата
				calc.cleanResult(); runType = "";
				
				System.out.println("Exit : yes / no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}

	
	
	public static void PrintNClean() {
	System.out.println("Test Print ");
	}
	
	}