public class Estagiario extends Funcionario{
	private double cargaHoraria;

	@Override
	public double calcularSalarioLiquido(){
		return super().getSalarioBase * (getCargaHoraria() / 40);
	}

	public double getCargaHoraria(){
		return this.cargaHoraria;
	}

	public void exibirDados(){
		super().exibirDados();
		System.out.println("Carga Horaria: " + getCargaHoraria());
	}

	public Estagiario(String nome, String matricula, double salarioBase, double cargaHoraria){
		super(nome, matricula, salarioBase);
		this.cargaHoraria = cargaHoraria;
	}
}
