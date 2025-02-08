public class Tarefa {
    public int id;
    public String descricao;
    public String data;
    public boolean feito;

    public String toString() {
        String f1;
        if (feito == false) {
            f1 = "Tarefa não finalizada";
        } else {
            f1 = "Tarefa conluída";
        }
        return "id: " + id + "\nDescrição: " + descricao + "\nData: " + data + "\n" + f1;
    }
    // isso ai representa minha classe tarefa inteira em uma String, Transforma os
    // atributos dela em uma string
    // transforma os atributos dela em string
}
