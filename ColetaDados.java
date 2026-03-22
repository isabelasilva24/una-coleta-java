import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("--- SISTEMA DE SELEÇÃO INTERESTELAR ---");
        System.out.println("Por favor, insira os dados do candidato.");

        // Nome
        System.out.print("Nome completo do aspirante: ");
        String nome = leitor.nextLine();

        // Idade
        System.out.print("Idade terrestre: ");
        int idade = leitor.nextInt();

        // Altura
        System.out.print("Altura (em metros): ");
        double altura = leitor.nextDouble();

        // Consumir quebra de linha pendente
        leitor.nextLine();

        // Experiência (corrigido)
        System.out.print("Possui experiência com pilotagem de drones? (sim/nao): ");
        String resposta = leitor.nextLine();

        boolean temExperiencia = resposta.equalsIgnoreCase("sim");

        // Saída
        System.out.println("\n--- PROCESSANDO DADOS DA FICHA ---");
        System.out.printf("Candidato: %s %n", nome);
        System.out.printf("Idade: %d anos | Altura: %.2f m %n", idade, altura);
        System.out.println("Qualificado para pilotagem? " + (temExperiencia ? "Sim" : "Não"));

        // Validação de idade
        if (idade >= 18 && idade <= 45) {
            System.out.println("Status: Apto para os testes físicos.");
        } else {
            System.out.println("Status: Idade fora dos parâmetros da missão.");
        }

        leitor.close();
        System.out.println("---------------------------------");
    }
}