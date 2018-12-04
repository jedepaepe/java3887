package semaine;


import java.util.Scanner;

public class DemoSemaine {

    public static void main(String[] args) {
        String[] semaine = {"lu", "ma", "me", "je", "ve", "sa", "di"};
        Scanner clavier = new Scanner(System.in);
        char touche = 'a';
        do {
            String line = clavier.nextLine();
            System.out.print("Jour de la semaine (1-7) ou 0 pour arrêter le programme: ");
            if(line.length() != 1) {
                System.out.println("Veuillez taper un seul caractère: 1,2,3... ou 7");
            } else {
                touche = line.charAt(0);
                if(touche >= '1' && touche <= '7') {
                    int index = touche - '1';   // '1' est codé comme 49
                    System.out.println(semaine[index]);
                } else if(touche != 0) {
                    System.out.println("Veuillez taper un seul caractère: 1,2,3... ou 7");
                }
            }
            System.out.println("");
        } while(touche != '0');
    }
    
}
