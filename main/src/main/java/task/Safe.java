package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Safe {
    public Safe(String pinCode){}
    private String pinCode = "0000";
    private ArrayList<String> safeFolder = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void setPin(String newPin)
    {
        this.pinCode = newPin;
    }

    public void addArrayComp(String givenPin)
    {
        if (givenPin.equals(pinCode) == true)
        {
            System.out.println("Anna kansioon lisättävä tieto:");
            safeFolder.add(scanner.next());
        }
        else 
        {
            System.out.println("Väärä PIN-koodi!");
        }
        
    }

    public void printArrayContents(String givenPin)
    {
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
