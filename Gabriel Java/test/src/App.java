import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        App a = new App();
        System.out.println("Insira os caracteres");
        String text = scan.nextLine();

        a.limitaString(text, 6);
    }

    public String limitaString(String texto, int maximo){
        return texto.length() <= maximo ? texto : texto.substring(0, maximo);
    }
}
