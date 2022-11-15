import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Databaza{

    private ArrayList<Pojistenec> zaznamy = new ArrayList<Pojistenec>();
    private Scanner sc = new Scanner(System.in);

    public void program(){
        System.out.println("_____________________");
        System.out.println("EVIDENCIA POJISTENCOV");
        System.out.println("_____________________");

        String prikaz = "";
        menu();

        while (!prikaz.equals("4")){

            System.out.println("Zvolte príkaz zadanim voľby: 1 , 2 , 3 ,4");
            prikaz = sc.nextLine();

            switch (prikaz){
                case "1":
                    PridatPojistenca();
                    break;
                case "2":
                    VypisPojistencov();
                    break;
                case "3":
                    VyhladajPojistenca();
                    break;
                case "4":
                    System.out.println("Appka sa zatvára");
                    break;
                default:
                    System.out.println("neplatná voľba");

            }


        }

    }

    void menu(){
        System.out.println("Appka pojistencov");
        System.out.println("_______________________________");
        System.out.println("1 - Pridať nového pojistenca");
        System.out.println("2 - Vypísať všetkých pojistencov");
        System.out.println("3 - Vyhladať pojistenca");
        System.out.println("4 - Ukončiť program");
        System.out.println("_______________________________");
    }

    void PridatPojistenca(){
        // Vytvorenie dátumu pridavanie mena priezviska veku a cisla uzivatelom
        LocalDate datumVytvoreniaPoistenca = LocalDate.now();
        System.out.println("Zadajte meno: ");
        String meno = sc.nextLine().trim();

        System.out.println("Zadajte priezvisko: ");
        String priezvisko = sc.nextLine().trim();

        System.out.println("Zadajte vek: ");
        int vek = Integer.parseInt(sc.nextLine());

        System.out.println("Zadajte telefonné číslo: ");
        String telCislo = sc.nextLine().trim();

        //konstruktor na noveho pojistenca
        Pojistenec pojistenec = new Pojistenec(datumVytvoreniaPoistenca, meno, priezvisko, vek, telCislo);

        // kontrola veku aby uzivatelia nezadavali blbosti
        if ((vek >0)&& (vek <100)){
            System.out.println("Uspešná registracia.");
            zaznamy.add(pojistenec);
        }else System.out.println("Zadali ste nesprávný vek, akciu opakujte znova prosím");

    }
    //vypis poistencov for loopom
    void VypisPojistencov(){

        for (int i = 0; i < zaznamy.size(); i++) {
            System.out.println(zaznamy.get(i).toString());
        }
    }

    //vyhladavanie pojistencov
    void VyhladajPojistenca(){
        System.out.println("Meno a priezvisko vyhľadavaného pojistenca: ");
        String hladaneMeno = sc.nextLine().trim();
        for(Pojistenec p: zaznamy){
            if (p.toString().contains(hladaneMeno)){
                System.out.println(p);
            }
        }
    }
    }


