import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Skriva en text
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Skriv in en text:");
        String text = tangentbord.nextLine();

        //Visa antalet ord
        System.out.println("        ");
        int antal_tecken = text.length();
        System.out.println("Texten du skrev ovan innehåller "+antal_tecken+" tecken.");

        //Söka efter tecken som skrivits tidigare
        System.out.println("        ");
        System.out.print("Ange tecken att söka efter: ");
        String text2 = tangentbord.nextLine();
        int t_index = text.indexOf(text2);
        System.out.println("Tecknet befinner sig på plats nummer "+t_index);
        tangentbord.close();
    }
}
