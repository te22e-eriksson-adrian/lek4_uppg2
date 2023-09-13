import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Skriva en text
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Skriv in en text:");
        String text = tangentbord.nextLine();

        //Visa antalet ord
        int antal_tecken = text.length();
        System.out.println("Texten du skrev ovan innehåller "+antal_tecken+" tecken.");
        tangentbord.close();
    }
}
