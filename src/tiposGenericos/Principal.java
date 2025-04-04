package tiposGenericos;

public class Principal {

	public static void main(String[] args) {
		Calculadora c=new Calculadora<Number>();
		c.setNum1(10);
		c.setNum2(2.5);
		System.out.println("La suma es:"+c.sumar());
		System.out.println("La resta es:"+c.resta());
		System.out.println("La multiplicación es:"+c.multiplicacion());
	}

}
