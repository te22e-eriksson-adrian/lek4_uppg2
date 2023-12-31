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
        System.out.println("(Skriv tecknet exakt som du skrev det i texten.)");
        System.out.print("Ange tecken att söka efter: ");
        String text2 = tangentbord.nextLine();
        int t_index = text.indexOf(text2);
        System.out.println("Tecknet befinner sig på plats nummer "+t_index);

        //Hämta deltext
        System.out.println("        ");
        System.out.println("(första tecknet är nummer 0, sedan räknar man uppåt ...)");
        System.out.print("Ange nummret på första teckenplatsen i intervallet du vill få hämtat: ");
        int plats1 = tangentbord.nextInt();
        System.out.print("Ange nummret på avslutande teckenplatsen i intervallet du vill få hämtat: ");
        int plats2 = tangentbord.nextInt();
        String del_strang = text.substring(plats1, plats2);
        System.out.println("Text från tecken "+plats1+" till "+plats2+" är: "+del_strang);
        tangentbord.nextLine();

        //Innehåller ord (sant / falskt)
        System.out.println("        ");
        System.out.print("Ange ord/tecken från texten som du vill kontrollera existensen på: ");
        String text3 = tangentbord.nextLine();
        boolean svar = text.contains(text3);
        System.out.println("Svar: "+svar);

        //byta ut text
        System.out.println("        ");
        System.out.println("Nu kan du byta ut en del av din text! Fyll i nedan:");
        System.out.print("Ange text/textdel som ska ersättas: ");
        String gammal_text = tangentbord.nextLine();
        System.out.print("Ange ny text/textdel: ");
        String ny_text = tangentbord.nextLine();
        String text_andring = text.replace(gammal_text, ny_text);
        System.out.println(gammal_text+" har bytts ut mot "+ny_text+" (se texten nedan)");
        System.out.println("        ");
        System.out.println(text_andring);
        
        tangentbord.close();
    }
}