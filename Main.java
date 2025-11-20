import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("Tipos de Funcionarios:");

        System.out.println("\n1 - Gerente");
        System.out.println("\n2 - Desenvolvedor");
        System.out.println("\n3 - Estagiário");
        System.out.println("\n4 - Sair");

        System.out.print("\n\nTipo> ");

    }

    private static String pedirDado(String mesagem, Scanner leitor) {
        if (mesagem != null) {
            System.out.print(mesagem);
        }

        return leitor.nextLine();
    }

    private static void menuDesenvolvdor() {
        System.out.println("Escolha o nível do desenvolvedor: ");

        System.out.println("\n1 - Júnior");
        System.out.println("\n2 - Pleno");
        System.out.println("\n3 - Sênior");

        System.out.print("Nível> ");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = 0;

        String nome, matriclua;
        double salarioBase = 0.0;

        nome = pedirDado("Nome do Funcionário: ", leitor);

        matriclua = pedirDado("Matrícula do Funcionário: ", leitor);

        salarioBase = Double.parseDouble(pedirDado("Salário Base do Funcionário: ", leitor));

        while (true) {
            menu();
            try {
                entrada = leitor.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Digite um tipo existente.");
                continue;
            }
        }

        leitor.nextLine();
        switch (entrada) {
            case 1 -> {
                double bonus = Double.parseDouble(pedirDado("Digite o bônus do gerente: ", leitor));
                Gerente gerente = new Gerente(nome, matriclua, salarioBase, bonus);

                gerente.exibirDados();
                break;
            }

            case 2 -> {
                NivelExperiencia nivel;

                while (true) {
                    menuDesenvolvdor();

                    int tipo = leitor.nextInt();
                    leitor.nextLine();

                    switch (tipo) {
                        case 1 -> {
                            nivel = NivelExperiencia.JUNIOR;

                            break;
                        }

                        case 2 -> {
                            nivel = NivelExperiencia.PLENO;

                            break;
                        }

                        case 3 -> {
                            nivel = NivelExperiencia.SENIOR;

                            break;
                        }

                        default -> {
                            System.out.println("O Nível nãao existe");
                            continue;
                        }
                    }

                    break;
                }

                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matriclua, salarioBase, nivel);

                desenvolvedor.exibirDados();
                break;
            }

            case 3 -> {
                double cargaHoraria = Double.parseDouble(pedirDado("Digite a carga horária do estagiário: ", leitor));
                Estagiario estagiario = new Estagiario(nome, matriclua, salarioBase, cargaHoraria);

                estagiario.exibirDados();
                break;
            }

            default -> {
                System.out.println("Saindo...");
                break;
            }
        }

        leitor.close();
    }
}
