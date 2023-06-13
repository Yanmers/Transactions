
public class NewCuenta {
	public static void main(String[] args) {
		Cliente primeracuenta = new Cliente();
		primeracuenta.setNombre("Mercedes");
//		primeracuenta.agencia = 02;
//		primeracuenta.numero = 123443;
//		primeracuenta.saldo = 10000;
		
		System.out.println(primeracuenta.getNombre());
		
		
		System.out.println();
		
		Cliente segundaCuenta = new Cliente();
//		segundaCuenta.agencia = 03;
//		segundaCuenta.numero = 43211;
//		segundaCuenta.saldo = 2340;
		segundaCuenta.setNombre("Stephanie Reyes");
		
//		System.out.println(segundaCuenta.titular);
//		System.out.println(segundaCuenta.agencia);
		
	}
	
}