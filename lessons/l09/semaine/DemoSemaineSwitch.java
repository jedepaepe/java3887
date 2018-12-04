package semaine;


import java.util.Scanner;


public class DemoSemaineSwitch {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String cmd = "";
        do {
            System.out.print("Veuillez taper un caractère entre 1 et 7 ou Q pour quitter: ");
            cmd = clavier.nextLine();
            switch(cmd) {
                case "1":
                    System.out.println("lundi");
                    break;
                case "2":
                    System.out.println("mardi");
                    break;
                // ... 3-6
                case "7":
                    System.out.println("dimanche");
                    break;
                case "Q":
                case "q":
                    System.out.println("byebye");
                    break;
                default:
                    System.out.println("Erreur, veuillez taper un caractères entre 1 et 7 ou Q");
            }
        } while(! cmd.toUpperCase().equals("Q"));
    }

}
