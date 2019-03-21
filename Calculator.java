public class Calculator {
	
	private double result; 
	
	public void add(double ... params) {		//Сложение
		for (Double param : params) {
			this.result += param;
		}
	}
	
	public void dec(double ... params) {		//Вычитание    
		for (Double param : params) {
			this.result=params[0]-params[1];
		}
	}
	
	public void x(double ... params) {			//Умножение    
		for (Double param : params) {
			this.result=params[0]*params[1];
		}
	}
	
	public void part(double ... params) {		//Деление    
		for (Double param : params) {
			this.result=params[0]/params[1];
		}
	}	
	
	public void sqt(double ... sparams) {		//Степень    
		for (Double sparam : sparams) {
			this.result=Math.pow(sparams[0],sparams[1]);
		
		}
	}	
	
    public double getResult() {
		return this.result;
	}
	
	
	public void cleanResult() {
		this.result = 0;
	}
}
