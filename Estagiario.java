import java.math.BigDecimal;

public class Estagiario extends Funcionario {
	private double cargaHoraria;

	@Override
	public double calcularSalarioLiquido() {
		return super.getSalarioBase() * (getCargaHoraria() / 40);
	}

	public double getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void exibirDados() {
		BigDecimal salario = new BigDecimal(calcularSalarioLiquido()).setScale(2);

		super.exibirDados();
		System.out.println("Carga Horaria: " + getCargaHoraria());
		System.out.println("Salário líquido: " + salario);
	}

	public Estagiario(String nome, String matricula, double salarioBase, double cargaHoraria) {
		super(nome, matricula, salarioBase);
		this.cargaHoraria = cargaHoraria;
	}
}
