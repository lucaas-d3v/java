public abstract class Funcionario{
	private String nome;
	private String matricula;
	private double salarioBase;

	public abstract double calcularSalarioLiquido();

	public void exibirDados(){
		System.out.println("===== TechPay - Folha de Pagamento\n");
		System.out.println("Nome do funcionário: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Salário base: " + getSalarioBase());
	}

	public String getNome(){
		return this.nome;
	}

	public String matricula(){
		return this.matricula;
	}

	public double getSalarioBase(){
		return this.salarioBase;
	}
}
