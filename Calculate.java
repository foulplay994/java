public class Calculate {
	
	public static void main(String[] arg) {
		System.out.println("Calculate");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		System.out.println("Sum " + summ);
		
		double dec = first - second;
		System.out.println("Dec " + dec);

		double x = first * second;
		System.out.println("X " + x);
		
		double part = first / second;
		System.out.println("Part " + part);

		double st = Math.pow(first,second);
		System.out.println("St " + st);
	}
	
}