import java.util.Scanner;

public class b_rectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");

        int lignes = Integer.parseInt(dimensions[0]);
        int longueur = Integer.parseInt(dimensions[1]);
        char symbole = scanner.next().charAt(0);

        String papierPeint = "";

        for(int i = 0; i < lignes; ++i) {
            for(int j = 0; j < longueur; ++j) {
                papierPeint = papierPeint + symbole;
            }
            papierPeint = papierPeint + "\n";
        }
        System.out.println(papierPeint);
    }
}
