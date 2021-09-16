public class App {

    /*

    private static Scanner _scanner;

    public static Scanner getScanner() {
        return _scanner;
    }

    public static void setScanner(Scanner _scanner) {
        App._scanner = _scanner;
    }
    */

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.startMenu();
        Auto auto = menu.newAuto();
        System.out.println("Automarke: "+auto._marke+", Modell: "+auto._modell+", Baujahr: "+auto._baujahr);

        /*

        setScanner(new Scanner(System.in));

        // Autos (4)
        Auto a1 = new Auto("VW","Caddy",2008);

        // "Auto" verweis auf Klasse "Auto", "a1" Objekt aus Klasse "Auto", "Auto()" Verweis auf Constructor, "("VW","Caddy",2008) Parameter für Constructor

        Auto a2 = new Auto("Opel","Zafira",2015);
        
        Auto a3 = new Auto("Volvo","V40",2020);

        Auto a4 = new Auto("ford","Kuga Hybrid",2021);


        // Kund*innen (4)
        Kunde k1 = new Kunde("Bernd", "Müller");
        
        Kunde k2 = new Kunde("Axel","Schmidt");
        
        Kunde k3 = new Kunde("Sofie","Holst");
        
        Kunde k4 = new Kunde("Lilly","Berg");
        

        // Verkäufer*innen (2)
        Verkaeufer v1 = new Verkaeufer("Franz","van Dietrichts","278");
        
        Verkaeufer v2 = new Verkaeufer("Antonia","","286");
        

        // Verkäufe (4)
        // Verkauf 1
        Verkauf vk1 = new Verkauf(a1,v1,k1);
        vk1.setPreis(3400);

        // Verkauf 2
        Verkauf vk2 = new Verkauf(a2,v2,k2);
        vk2.setPreis(1300);

        // Verkauf 3
        Verkauf vk3 = new Verkauf(a3,v2,k3);
        vk3.setPreis(23000);

        // Verkauf 4
        Verkauf vk4 = new Verkauf(a4,v1,k4);
        vk4.setPreis(67236);

        // Ausgabe Verkäufe

        /*
        System.out.println(vk1.getAuto().getMarke()+" "+vk1.getPreis()+" "+vk1.getKunde().getVorname()+" "+vk1.getVerkaeufer().getVorname()+" "+vk1.getAuto().getModell());
        System.out.println(vk2.getAuto().getMarke()+" "+vk2.getPreis()+" "+vk2.getKunde().getVorname()+" "+vk2.getVerkaeufer().getVorname()+" "+vk2.getAuto().getModell());
        System.out.println(vk3.getAuto().getMarke()+" "+vk3.getPreis()+" "+vk3.getKunde().getVorname()+" "+vk3.getVerkaeufer().getVorname()+" "+vk3.getAuto().getModell());
        System.out.println(vk4.getAuto().getMarke()+" "+vk4.getPreis()+" "+vk4.getKunde().getVorname()+" "+vk4.getVerkaeufer().getVorname()+" "+vk4.getAuto().getModell());
        

        startMenu();
        */

    }

    /*
    private static void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");

        String choice = getScanner().nextLine();
        System.out.println("Hier geht es weiter mit: " + choice);
    }
    */
}


/*
Hausaufgabe:
In Klasse Menu Methode erstellen um Daten für Auto in Terminal einzugeben

*/

