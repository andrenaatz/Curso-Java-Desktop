package curso_java_completo;

public class Conta {
	
	private String usuario;
	private int nr_conta;
	private double saldo;
	
	public Conta(String usuario, int conta) {
		
		this.usuario = usuario;
		this.nr_conta = conta;
		
	}
	
	public Conta(String usuario, int conta, double dep_inicial) {
		
		this.usuario = usuario;
		this.nr_conta = conta;
		deposito(dep_inicial);
		
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNr_conta() {
		return nr_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double depositar) {
		
		saldo += depositar;
	}
	
	public void sacar(double saque) {
		
		saldo -= saque + 5;
	}

	@Override
	public String toString() {
		return "Conta [usuario=" + usuario + ", nr_conta=" + nr_conta + ", saldo=" + saldo + "]";
	}
	

}
