package jatekmenet;

import java.util.Scanner;

public class Lada {
    private String szin;
    
    
    public Lada(String szin){
        this.szin = szin;
    }

    public String getSzin() {
        return szin;
    }


    public void setSzin(String szin) {
        this.szin = szin;
    }
    
    public static void Jatek(){
        Scanner s = new Scanner(System.in);
        System.out.println("üdvözöllek kalandor, hogy szólíthatlak?");
        String JatekosNev = s.nextLine();
        System.out.println("3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat, de csak az egyik láda állítása igaz! És csak egy ládát nyithatsz fel");
        System.out.println("készenállsz"+" "+JatekosNev+"?");
        String Keszenalle = s.nextLine();
        System.out.println("megtaláltad a ládákat");
        System.out.println("arany láda: én rejtem a kincset ");
        System.out.println("ezüst láda: nem én rejtem a kincset ");
        System.out.println("bronz láda: az arany hazudik");
        System.out.println();
        System.out.println("Na"+" "+JatekosNev+ " " + "melyik láda rejti a régóta keresett kincset?");
        System.out.println("ha ugy gondolod hogy az arany, akkor írd azt hogy: A");
        System.out.println("ha meg az ezüstre gyanakodsz írd hogy: E");
        System.out.println("de ha a bronz ládára esne a választásod írd azt hogy: B");
        
        System.out.println("kérlek add meg a válaszod: ");
        String Valasz = s.nextLine();
        while(!(Valasz.equals("A") || Valasz.equals("E") || Valasz.equals("B"))){
            System.out.println("kérlek a fent felsorolt opciók közül válassz: ");
            Valasz = s.nextLine();
        }
        
        if(Valasz.equals("A")){
            System.out.println("Sajnos nem Jó ládát nyitottál fel. Nem az aranyláda rejette a kincset. A kincs megtalálatlan maradt");
        }
        if(Valasz.equals("E")){
            System.out.println("Gratulálok"+ " " +JatekosNev+ " " +"megtaláltad az elveszett kincset");
        }
        if(Valasz.equals("B")){
            System.out.println("Sajnos nem Jó ládát nyitottál fel. Nem az bronz láda rejette a kincset. A kincs megtalálatlan maradt");
        }
    } 
}
