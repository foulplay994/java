public class Calculator {
	
	private double result;  // переменная результата
	
	public void add(double ... params) {		// сложение
		for (Double param : params) {
			this.result += param;
		}
	}
	
	public void dec(double ... params) {		// вычитание    
		for (Double param : params) {
			this.result=params[0]-params[1];
		}
	}
	
	public void x(double ... params) {			// умножение    
		for (Double param : params) {
			this.result=params[0]*params[1];
		}
	}
	
	public void part(double ... params) {		// деление    
		for (Double param : params) {
			this.result=params[0]/params[1];
		}
	}	
	
	public void sqt(double ... sparams) {		// степень    
		for (Double sparam : sparams) {
			this.result=Math.pow(sparams[0],sparams[1]);
		
		}
	}	
	
    public double getResult() {					// вывод результата
		return this.result;
	}
	
	
	public void cleanResult() {					// очистка результата
		this.result = 0;
	}
}
