import java.math.BigDecimal;

public class Gerente extends Funcionario {
	private double bonus;

	@Override
	public double calcularSalarioLiquido() {
		return getSalarioBase() + getBonus();
	}

	public Gerente(String nome, String matricula, double salarioBase, double bonus) {
		super(nome, matricula, salarioBase);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void exibirDados() {
		BigDecimal salario = new BigDecimal(calcularSalarioLiquido()).setScale(2);

		super.exibirDados();
		System.out.println("Bônus: " + getBonus());
		System.out.println("Salario Líquido: " + salario);
	}
}
