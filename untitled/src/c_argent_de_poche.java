import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class c_argent_de_poche {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nombreNotes = Integer.parseInt(scanner.nextLine());

        String[] notesTemp = scanner.nextLine().split(" ");

        ArrayList<Float> note = new ArrayList<Float>();

        for (int i = 0; i< notesTemp.length; i++)
        {
            note.add(Float.parseFloat(notesTemp[i]));
        }

        float max = Collections.max(note);
        float min = Collections.min(note);

        float moyenne=0;
        for (float i : note)
        {
            moyenne += i;
        }

        moyenne = moyenne/nombreNotes;

        float somme = (20 - (max - min)) * moyenne*moyenne * 1/100;

        DecimalFormat df = new java.text.DecimalFormat("0.##");

        System.out.println(df.format(somme));

    }
}