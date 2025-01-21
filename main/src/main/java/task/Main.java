package task;
import java.util.Scanner;

public class Main {


    public static void menuPrint()
    {
        System.out.println("1) Aseta PIN-koodi");
        System.out.println("2) Lisää tietoja kansioon");
        System.out.println("3) Listaa tiedot kansiosta");
        System.out.println("0) Lopeta ohjelma");
    }

    public static void SetPin(Safe safe)
    {

    }

    public static void main(String[] args) {
        Safe safe = new Safe();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            menuPrint();
            switch (scanner.next()) {
                case "1":
                    System.out.println("Anna uusi PIN-koodi:");
                    safe.setPin(scanner.next());
                    break;
                case "2":
                    safe.addArrayComp(scanner);
                    break;
                case "3":
                    safe.printArrayContents(scanner);
                    break;
                case "0":
                    System.out.println("Kiitos ohjelman käytöstä.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Väärä valinta, koita uudelleen");
                    break;
            }
        }
    }
}