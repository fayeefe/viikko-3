package task;
import java.util.Scanner;

public class App {


    public static void menuPrint()
    {
        System.out.println("1) Aseta PIN-koodi");
        System.out.println("2) Lisää tietoja kansioon");
        System.out.println("3) Listaa tiedot kansiosta");
        System.out.println("0) Lopeta ohjelma");
    }

    public static void main(String[] args) {
        Safe safe = new Safe("0000");
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            menuPrint();
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Anna uusi PIN-koodi:");
                    safe.setPin(scanner.nextLine());
                    break;
                case "2":
                    System.out.println("Anna kansioon lisättävä tieto:");
                    safe.addArrayComp(scanner.nextLine());
                    break;
                case "3":
                    System.out.println("Anna PIN-koodi:"); 
                    safe.printListContents(scanner.nextLine());
                    break;
                case "0":
                    System.out.println("Kiitos ohjelman käytöstä.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Väärä valinta, koeta uudelleen");
                    break;
            }
        }
    }
}