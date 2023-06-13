
//Tipe of class.

public class Cuenta{
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	
	public void depositar(double valor) {
		//This is the correct senten, example
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor){
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tranferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.saldo = cuenta.saldo + valor;
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setAgencia(int nuevaAgencia) {
		if(agencia > 0) {
			this.agencia = nuevaAgencia;
		}
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	
}
