//Encapsulling
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Yaniel");
		cliente.setDocument("123432");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.titular.getNombre());
	}
}
