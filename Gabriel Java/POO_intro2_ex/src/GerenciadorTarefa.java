import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorTarefa {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    Map<Integer, Tarefa> tabelaTarefa = new HashMap<>();
    // Método que cria tarefas
    public void adicionarTarefa() {
        // Tarefa é uma classe e tarefa(com t minúsculo) é como se fosse uma variável/
        // instancia da classe Tarefa
        Tarefa tarefa = new Tarefa();
        tarefa.id = ++n; //++ vem antes porque ele retorna o valor de n já somado 
        System.out.println("Informe a descrição da tarefa: ");
        tarefa.descricao = scan.nextLine();
        System.out.println("Informe a data de criação da tarefa: ");
        tarefa.data = scan.nextLine();
        tarefa.feito = false;
        System.out.println(tarefa.feito);
        tabelaTarefa.put(tarefa.id, tarefa);
        System.out.println("O ID da sua tarefa é: " + tarefa.id);
    }

    public void visualizarTarefa() {
        int i;
        Tarefa tarefa;
        System.out.println("Digite o id da sua tarefa: ");
        i = scan.nextInt();
        tarefa = tabelaTarefa.get(i);
        System.out.println(tarefa);
        //preciso de uma forma de buscar a tarefa pela sua chave e relacionar o número digitado com essa chave
    }

    public  void removerTarefa(){
        int i;
        System.out.println("Qual tarefa você quer remover?");
        i = scan.nextInt();
        tabelaTarefa.remove(i);
        System.out.println("Sua Tarefa foi Removida");
    }

    public void editarTarefa(){
        int i;
        Tarefa tarefa;
        System.out.println("Qual Tarefa deseja editar?");
        i = scan.nextInt();
        tarefa = tabelaTarefa.get(i);
        System.out.println("Informe a descrição da nova tarefa: ");
        tarefa.descricao = scan.nextLine();
        System.out.println("Data de criação da nova tarefa: " + tarefa.data);
        tarefa.feito = false;
        System.out.println(tarefa.feito);
        tabelaTarefa.put(tarefa.id, tarefa);
        

    }   

}
