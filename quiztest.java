import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class quiztest {

    public static void main(String[] args) {

        int punkte = 0;

        System.out.println("Bitte gib dein Name ein!\n");

        try (Scanner sc = new Scanner(System.in)) {
            String eingabe1 = sc.next();

            System.out.println(
                    "Hallo  " + eingabe1
                            + " ,und Herzlich Willkommen in Level 1!\n\nBeantworte die 10 Fragen richtig, um ins nächste Level zukommen! \n ");

            String[] frage1 = {
                    "Wie lautet die Hauptstadt von Deutschland?\n",
                    "1 Hamburg",
                    "2 Berlin",
                    "3 Schwerin",
                    "Berlin"

            };

            String[] frage2 = {
                    "Wie viele Bundesländer hat Deutschland?\n",
                    "1 10",
                    "2 8",
                    "3 16",
                    "16"

            };

            String[] frage3 = {
                    "Wie viele Monate haben 31 Tage?\n",
                    "1 7",
                    "2 8",
                    "3 3",
                    "7"

            };

            String[] frage4 = {
                    "Was ist das kleinste Bundesland Deutschland?\n",
                    "1 Mecklenburg- Vorpommern",
                    "2 Hamburg",
                    "3 Bremen",
                    "Bremen"

            };

            String[] frage5 = {
                    "Was ist das größte Bundesland Deutschland?\n",
                    "1 NRW",
                    "2 Sachsen- Anhalt",
                    "3 Bayern",
                    "Bayern"

            };

            String[] frage6 = {
                    " Wie lautet die Hauptstadt von Mecklenburg-Vorpommern?\n",
                    "1 Schwerin",
                    "2 Rostock",
                    "3 Neustrelitz",
                    "Schwerin"

            };

            String[] frage7 = {
                    "Was lautet die Hauptstadt von NRW \n",
                    "1 Duesseldorf",
                    "2 Koeln",
                    "3 Solingen",
                    "Duesseldorf"

            };

            String[] frage8 = {
                    "Was lautet die Hauptstadt von Bayern \n",
                    "1 Duesseldorf",
                    "2 Aachen",
                    "3 Muenchen",
                    "Muenchen"

            };

            String[] frage9 = {
                    "Welcher Monat hat 28 Tage? \n",
                    "1 Dezember",
                    "2 August",
                    "3 Februar",
                    "Februar"

            };

            String[] frage10 = {
                    "Wann sind die Heiligen 3 Könige? \n",
                    "1 6.Januar",
                    "2 6.Februar",
                    "3 6.April",
                    "6.Januar"

            };

            String[][] liste = {
                    frage1, frage2, frage3, frage4, frage5, frage6, frage7, frage8, frage9, frage10
            };

            for (int i = 0; i < liste.length; i++) {

                System.out.println(liste[i][0]);
                System.out.println(liste[i][1]);
                System.out.println(liste[i][2]);
                System.out.println(liste[i][3]);
                System.out.println("\nBitte Antwort eingeben:\n ");

                BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
                try {
                    String antwort = eingabe.readLine();
                    System.out.println(eingabe1 + " deine Antwort lautet: \n\n" + antwort);

                    if (antwort.equals(liste[i][4])) {
                        System.out.println("\nDiese Antwort ist richtig! \n");
                        punkte++;

                    } else {
                        System.out.println("Leider ist die Antwort falsch!\n ");

                    }

                } catch (IOException e) {
                    System.out.println("Falsche Eingabe");

                }

                System.out.println("Glückwunsch " + eingabe1 + " du hast " + punkte + " erreicht! \n");

            }
        }
        if (punkte == 10) {

            System.out.println(
                    "Dein Punktestand beträgt: " + punkte + " Punkte Du hast den Aufstieg in Level 2 erreicht.");
        } else {

            System.out.println("Schade Du haben Level 1 nicht geschafft.");
        }
        System.out.println(
                "Willkommen in Level 2.\n\n Beantworte die nächsten 10 Fragen richtig um in Level 3 zu kommen! ");
    }

}
