package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Safe {
    public Safe(String pinCode){}
    String pinCode = "0000";
    private ArrayList<String> safeFolder = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void setPin(String newPin)
    {
        this.pinCode = newPin;
    }

    public void addArrayComp(String addedString)
    {
            safeFolder.add(addedString);       
    }

    public ArrayList<String> printListContents(String givenPin)
    {
        if (givenPin.equals(pinCode) == true)
        {

            safeFolder.forEach(System.out::println);
        }
        else 
        {
            System.out.println("Väärä PIN-koodi!");
        }
        return safeFolder;
    }
}
