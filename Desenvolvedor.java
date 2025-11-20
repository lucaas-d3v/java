public class Desenvolvedor{
	private  NivelExperiencia nivel;

	@Override
	public double calcularSalarioLiquido(){
		double modificador = 1;

		if (getNivel() == NivelExperiencia.JUNIOR){
			modificador = 1.1;
		} else if (getNivel() == NivelExperiencia.PLENO){
			modificador = 1.3;
		} else {
			modificador = 1.5;
		}

		return super().getSalarioBase() * modificador;
	}

	public double getNivel(){
		return this.nivel;
	}

	public void exibirDados(){
		super().exibirDados();
		System.out.println("Nivel Experiência: " + getNivel());
	}

	public Desenvolvedor(String nome, String matricula, double salarioBase, NivelExperiencia nivel){
		super(nome, matricula, salarioBase);
		this.nivel = nivel;
	}
}
