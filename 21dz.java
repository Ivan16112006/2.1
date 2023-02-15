public class Main {
	public static void main(String[] args) {
		int a = 70;
		int ask = 77;
		int b = 25;
		int bsk = 37;
		int c = 53;
		int csk = 44;
		int d = 19;
		int dsk = 0;
		int e = 41;
		int esk = 32;
		int n = 312;
		int sum= zena(a, ask)+zena(b, bsk)+zena(c, csk)+zena(d, dsk)+zena(e, esk);
		if(n<sum) {
			System.out.println("Стоимость: "+sum);
			System.out.println("Денег не хватает");
			System.out.println("Не хвaтает: "+(sum-n));
		}
		else{ 
		System.out.println("Стоимость: "+(sum));
		System.out.println("Денег хватает");
		System.out.println("Остаток: "+(n-sum));
		}
	}
	static int zena(int a, int b){		
		return a-a*b/100;
	}
	
}