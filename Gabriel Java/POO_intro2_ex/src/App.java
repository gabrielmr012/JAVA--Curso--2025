import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        GerenciadorTarefa tarefa = new GerenciadorTarefa();

        while (opcao < 4) {
            System.out.println("----CADERNO DE TAREFAS----");
            System.out.println("Selecione uma Opção: ");
            System.out.println("[1] - Adicionar uma Tarefa");
            System.out.println("[2] - Vizualizar uma Tarefa");
            System.out.println("[3] - Remova uma Tarefa");
            System.out.println("[4] - Editar uma Tarefa");
            System.out.println("[5] - Sair do Programa");
            opcao = scan.nextInt();

            if (opcao == 1) {
                tarefa.adicionarTarefa();
            } else if (opcao == 2) {
                tarefa.visualizarTarefa();
            } else if (opcao == 3){
                tarefa.removerTarefa();
            } else if (opcao == 4) {
                tarefa.editarTarefa();
            } else if (opcao == 5) {
                break;
            }

        }

    }

}

// o while tava dando errado, descobrir o porque