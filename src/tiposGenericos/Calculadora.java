package tiposGenericos;

public class Calculadora<T extends Number> {
	
	private T num1,num2;
	private String a;

	public Double sumar() {
		
		return num1.doubleValue()+num2.doubleValue();
	}
	public Double resta() {
		
		return num1.doubleValue()-num2.doubleValue();
	}
	public Double multiplicacion() {
		
		return num1.doubleValue()*num2.doubleValue();
	}
	
	
	public T getNum1() {
		return num1;
	}

	public void setNum1(T num1) {
		this.num1 = num1;
	}

	public T getNum2() {
		return num2;
	}

	public void setNum2(T num2) {
		this.num2 = num2;
	}
	

}
