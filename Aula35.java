public class Aula35 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("........");
        for (String string : args) {
            System.out.println(string);
            
        }
    }
}