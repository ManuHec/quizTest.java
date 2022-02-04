import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiztest {

    public static void main(String[] args) {

        int punkte = 0;

        String[] frage1 = {
                "Wie lautet die Hauptstadt von Deutschland?",
                "1 Hamburg",
                "2 Berlin",
                "3 Schwerin",
                "Berlin"

        };

        String[][] liste = {
                frage1
        };

        for (int i = 0; i < liste.length; i++) {

            System.out.println(liste[i][0]);
            System.out.println(liste[i][1]);
            System.out.println(liste[i][2]);
            System.out.println(liste[i][3]);
            System.out.println("Bitte Antwort eingeben: ");

            BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
            try {
                String antwort = eingabe.readLine();
                System.out.println("Ihre Antwort lautet: " + antwort);

                if (antwort.equals(liste[i][4])) {
                    System.out.println("Die Antwort ist richtig! ");
                    punkte++;

                } else {
                    System.out.println("Leider ist die Antwort falsch! ");

                }

            } catch (IOException e) {
                System.out.println("Falsche Eingabe");

            }

            System.out.println("Glückwunsch sie hab " + punkte + "erreicht! ");

        }

    }
}