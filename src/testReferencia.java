//Test.

public class testReferencia {
	public static void main(String[] args) {
		Cliente yaniel = new Cliente();
		yaniel.setDocument("402-1393781-2");
		yaniel.setTelefono("849-227-3344");
		yaniel.setNombre("Yaniel Mercedes");
		
		Cuenta cuentaYaniel = new Cuenta();
		cuentaYaniel.titular = yaniel;
		System.out.println(cuentaYaniel.titular.getDocument());
		
		
	}
}
