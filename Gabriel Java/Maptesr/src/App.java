import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //Hashmap - mais rápido mas os elementos de dados ficam desordenados
        //TreeMap - mais lento, mas ordena os elementos com arvóre-rubro negra
        //LinkedHashmap - velocidade intermediaria e elementos na ordem em que são adicionadas
        Map<Integer, String> map = new HashMap(); 
        map.put(1, "Tarefa");
        System.out.println(map.get(1));
    }
}
