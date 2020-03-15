import java.util.Arrays;
import java.util.List;

public class Aula36 {

    public static void main(String[] args) {
        //as 3 opções abaixo fazem a mesma coisa.
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("........");
        for (String string : args) {
            System.out.println(string);
        }
        System.out.println("........");
        List<String> list = Arrays.asList(args);
        list.stream()
            .forEach(string -> {
                System.out.println(string);
            });
    }
}