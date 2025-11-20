public class Gerente extends Funcionario{
	private double salarioLiquido;

	@Override
	public double calcularSalario(){
		return 0;
	}

	public Gerente(String nome, String matricula, double salarioBase, double bonus){
		super(nome, matricula, salarioBase);
		this.salarioLiquido = salarioBase + bonus;
	}

	public double getSalarioLiquido(){
		return this.salarioLiquido;
	}

	public void exibirDados(){
		super().exibirDados();
		System.out.println("Salario Líquido: " + getSalarioLiquido());
	}
}
