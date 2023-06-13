//Continuw escapsulling.
public class PruebaAcceso {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(500);
		cuenta.retirar(400);
		cuenta.setAgencia(22);
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		
		
		
	}
}
