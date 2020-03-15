public class Aula3 {

    public static void main(String[] args) {
        //args[0] ou args[1] == "Daniela" // || significa ou
        if(args[0].equals("Daniela") || args[0].equals("Daniela")) {
            System.out.println("D " + args[0] + " é demais");
            System.out.println("D " + args[1] + " é demais");
        } else {
            System.out.println("Não tem meu nome por aqui!");
        }
    }
}