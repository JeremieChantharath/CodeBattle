import java.util.Objects;
import java.util.Scanner;

public class a_dis_papa {
    public a_dis_papa() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrasePapa = scanner.nextLine().split(" ");
        String phraseBebe = "";
        if (Objects.equals(phrasePapa[0], "dis")) {
            for(int i = 1; i < phrasePapa.length; ++i) {
                phraseBebe = phraseBebe + phrasePapa[i] + " ";
            }

            System.out.println(phraseBebe);
        }

    }
}
