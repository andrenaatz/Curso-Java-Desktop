package curso_java_completo;

public class CadFuncionarios {
	
	private Integer id;
	private String funcionario;
	private Double salario;
	
	public CadFuncionarios() {
		
	}
	
	public CadFuncionarios(Integer id, String funcionario, Double salario) {
		
		this.id = id;
		this.funcionario = funcionario;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getFuncionario() {
		return funcionario;
	}

	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cadastro de Funcionarios"
				+ " [id=" + id + 
				", funcionario=" + funcionario + 
				", salario=" + salario + "]"+"///";
				
	}
	
	
	
	
	

}
