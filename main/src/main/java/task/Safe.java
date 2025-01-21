package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Safe {
    private String pinCode = "0000";
    private ArrayList<String> safeFolder = new ArrayList<>();

    public void setPin(String newPin)
    {
        System.out.println(pinCode);
        this.pinCode = newPin;
    }

    public void addArrayComp(Scanner scanner)
    {
        System.out.println("Anna PIN-koodi");
        String givenPin = scanner.next(); 
        if (givenPin.equals(pinCode) == true)
        {
            safeFolder.add(scanner.next());
        }
        else 
        {
            System.out.println("Väärä PIN-koodi!");
        }
        
    }

    public void printArrayContents(Scanner scanner)
    {
        System.out.println("Anna PIN-koodi 3");
        String givenPin = scanner.next(); 
        if (givenPin.equals(pinCode) == true)
        {
            for (String string : safeFolder) {
                System.out.println(string);
            }
        }
        else 
        {
            System.out.println("Väärä PIN-koodi!");
        }
    }
}
