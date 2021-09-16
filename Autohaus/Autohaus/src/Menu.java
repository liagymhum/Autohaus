import java.util.Scanner;

public class Menu {
    
    Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte wähle aus:\n(1) Neuer Verkauf\n(2) Neuer Kunde\n(3) Neues Auto\n(4) Neuer Verkäufer");
        int num = getScanner().nextInt();
        String choice;
        boolean weiter;


        switch(num){
            case 1: choice = "Neuer Verkauf"; weiter = true; break;
            case 2: choice = "Neuer Kunde"; weiter = true; break;
            case 3: choice = "Neues Auto"; weiter = true; break;
            case 4: choice = "Neuer Verkäufer"; weiter = true; break;
            default: weiter = false; choice = "Falsche Angabe!"; break;
        }

        if (weiter == true){
            System.out.println("Hier geht es weiter mit: "+choice);
        } else{
            System.out.println(choice);
        }
    }

    public Auto newAuto(){
        System.out.println("Bitte gib eine Automarke an: ");
        String marke = getScanner().next();

        System.out.println("Bitte gib ein Modell an: ");
        String modell = getScanner().next();

        System.out.println("Bitte gib ein Baujahr an: ");
        int baujahr = getScanner().nextInt();

        Auto auto = new Auto(marke,modell,baujahr);
        return auto;
    }

    public Scanner getScanner() {
        return _scanner;
    }

    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }

}
