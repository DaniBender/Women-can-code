public class Aula32 {

    public static void main(String[] args) {
        switch (args[0]) {
            case "Daniela":
                System.out.println("Daniela na área!");
                //break;
            case "Bender":
                System.out.println("Bender na área!");
                //break;          
            default:
                System.out.println("Quem está por ai? $:" + args[0]);
                //break;
        }

    }
}