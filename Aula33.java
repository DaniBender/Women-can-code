public class Aula33 {

    public static void main(String[] args) {
        int idade = 36;
        int i = 0;
        while (i++ < 3) { //soma o i após o primeiro processamento, se ++i ele somaria antes
            switch (idade) {
                case 18:
                   System.out.println("Num pode beber");
                    break;
              case 20:
                    System.out.println("Ta liberado");
                    break;          
                default:
                    System.out.println("Pode encher a cara $:" + args[0]);
                    break;
            }
        }

    }
}